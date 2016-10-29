class ComplexEscaping {
    Integer e;
}

class Foo {
    Integer w, x, y, z, q;
    static Integer a = 1, b = 2, c = 3, d = 4, escapes = 5;

    void m1() {
        Integer W = new Integer(0);
        w = W;
        W = w;
        Integer A = new Integer(0);
        a = A;
        A = a;
        m2();
    }

    void m2() {
        Integer X = new Integer(0);
        x = X;
        X = x;
        Integer B = new Integer(0);
        b = B;
        B = b;
        m3();
    }

    void m3() {
        Integer Y = new Integer(0);
        y = Y;
        Y = y;
        Integer C = new Integer(0);
        c = C;
        C = c;
        m4();
    }

    void m4() {
        Integer Z = new Integer(0);
        z = Z;
        Z = z;
        Integer D = new Integer(0);
        d = D;
        D = d;
    }

    void unreachable() {
        Integer Q = new Integer(0);
        a = Q;
        b = Q;
        c = Q;
        d = Q;
        Q = a;
        Q = b;
        Q = c;
        Q = d;
        w = Q;
        x = Q;
        y = Q;
        z = Q;
        Q = w;
        Q = x;
        Q = y;
        Q = z;
    }


    Integer testEscaping(Integer t, ComplexEscaping c1, ComplexEscaping c2) {
        Integer e1 = new Integer(0);
        Integer e2 = new Integer(0);
        Integer e3 = new Integer(0);
        Integer e4 = new Integer(0);
        Integer e5 = new Integer(0);
        
        Integer local = new Integer(0);
        
        t = e1;
        c1.e = e2;
        ComplexEscaping c = new ComplexEscaping();
        c.e = e3;
        c2.e = c.e;
        escapes = e4;
        e5 = transitiveEscaping();
        return e5;
    }

    Integer transitiveEscaping() {
        Integer e = new Integer(0);
        return e;
    }
}

class TestCase2 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.m1();
        foo.q = 5;
        Integer Q = foo.q;
        Integer t = new Integer(0);
        ComplexEscaping c1 = new ComplexEscaping(), c2 = new ComplexEscaping();
        foo.testEscaping(t, c1, c2);
    }
}
