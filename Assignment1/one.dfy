class Lock {
var state:bool;
constructor init() modifies this; ensures state == false; {
state := false;
}
method acquireLock() modifies this; requires state == false; ensures state == true; {
state := !state;
}
method releaseLock() modifies this; requires state == true; ensures state == false; {
state := !state;
}
}