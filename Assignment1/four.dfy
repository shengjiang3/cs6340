predicate sorted(a:array<int>, left:int, right:int)
requires a!=null && 0 <= left <= right <= a.Length; 
reads a; {
  forall x:int :: left <= x < right - 1 ==> a[x] <= a[x + 1]
}
method bubbleSort(a: array<int>)
requires a != null && a.Length > 1; 
modifies a;
ensures sorted(a, 0, a.Length); {
var sortedUntil := 0;
var i := a.Length - 1;
while (sortedUntil < a.Length)
invariant 0 <= sortedUntil <= a.Length; 
invariant forall j, k :: 0 <= j < sortedUntil <= k < a.Length ==> a[j] <= a[k]; 
invariant sorted(a, 0, sortedUntil); {
  i := a.Length - 1;
  while(i > sortedUntil)
  invariant sortedUntil <= i < a.Length;
  invariant forall j, k :: 0 <= j < sortedUntil <= k < a.Length ==> a[j] <= a[k];
  invariant forall j :: i <= j < a.Length ==> a[i] <= a[j];
  invariant sorted(a, 0, sortedUntil); {
    if(a[i] <= a[i - 1]) {
      a[i - 1], a[i] := a[i], a[i - 1];
    }
    i := i - 1; 
  } 
  sortedUntil := sortedUntil + 1;
}
}
