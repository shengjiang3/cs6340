#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>
#include <signal.h>
#include <unistd.h>

#define MAXLEN 1024
#define TRUE  1
#define FALSE 0

typedef struct Link {
    int data;
    struct Link* next;
} Link;

Link* sort(Link*);

int  start_alarm(int);
void catch_alarm();

int main(int argc, char* argv[])
{
    Link *head = NULL, *x;
    char s[MAXLEN];

    if (argc != 3) {
        printf("Usage: sort <input list> <timeout>\n");
        exit(1);
    }

    /* read input file assuming one integer per line */

    FILE* fp = fopen(argv[1], "r");
    if (fp == NULL) {
        printf("Error: can't open file: %s\n", argv[1]);
        exit(1); 
    }

    while (1) {
        if (fgets(s, MAXLEN, fp) == NULL)
            break;
        x = (Link*) malloc(sizeof(Link));
        if (x == NULL) {
            printf("Error: malloc failed\n");
            exit(1);
        }
        x->data = atoi(s);
        x->next = head;
        head = x;
    }
    fclose(fp);

    /* setup alarm */

    int timeout = atoi(argv[2]);

    if (signal(SIGVTALRM, catch_alarm) == SIG_ERR) {
        printf("Error: catch_alarm failed\n");
        exit(1);
    }

    if (start_alarm(timeout) == -1) {
        printf("Error: start_alarm failed\n");
        exit(1);
    }

    /* sort input list */

    head = sort(head);

    /* output sorted list */

    for (x = head; x != NULL; x = x->next)
        printf("%d\n", x->data);

    return 0;
}

Link* sort(Link* x) {
    Link *p, *t, *y, *z;
    int changed = TRUE;

    while (changed == TRUE) {
        p = NULL;
        changed = FALSE;
        y = x;
        z = y->next;
        while (z != NULL) {
            if (y->data >= z->data) {
                t = z->next;
                changed = TRUE;
                y->next = t;
                z->next = y;
                if (p == NULL) 
                    x = z;
                else
                    p->next = z;
                p = z;
                z = t;
            } else {
                p = y;
                y = z;
                z = y->next;
            }
        }
    }

    return x;
}

int start_alarm(int timeout) {
  struct itimerval old, new;
  new.it_interval.tv_usec = 0;
  new.it_interval.tv_sec = 0;
  new.it_value.tv_usec = 0;
  new.it_value.tv_sec = timeout;
  return setitimer(ITIMER_VIRTUAL, &new, &old);
}

void catch_alarm() {
    printf("Error: timeout\n");
    exit(1);
}

