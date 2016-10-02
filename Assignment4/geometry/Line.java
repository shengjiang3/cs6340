public class Line implements Comparable<Line>{
  private Point a, b;
  static Line newestLine;

  public Line(Point a, Point b) {
    this.a = a;
    this.b = b;
    newestLine = this;
  }
  void replaceIfCloser(Point other) {
    if (other.distanceTo(a) > b.distanceTo(a)) 
      other.copyTo(this.b);
  }
  void replaceWithOrigin() {
    replaceIfCloser(new Point(0,0));
  }
  void swapCoordinates() {
    getThis().a.swapMyCoordinates();
    getThis().b.swapMyCoordinates();
  } 
  private Line getThis() {
    return this; 
  }
  void checkAndSwapCoordinates() {
    if (a.distanceToOrigin() > b.distanceToOrigin()) 
      swapCoordinates();
  }

  @Override
  public int compareTo(final Line o) {
      if (o == null) return 1;
      double lenThis = this.a.distanceTo(this.b);
      double lenThat = o.a.distanceTo(o.b);
      if (lenThis > lenThat) return 1;
      else if (lenThis == lenThat) return 0;
      else return -1;
  }
  
  @Override
  public boolean equals(Object o) {
      if (o == null) return false;
      Line that = (Line) o;
      if ((this.a == null && that.a == null) || this.a.equals(that.a))
    	  if ((this.b == null && that.b == null) || this.b.equals(that.b))
    		  return true;
      return false;
  }
}
