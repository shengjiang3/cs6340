class Point{
	Float x;
	Float y;
	
	static Integer isEuclidean = 1;
	
	Float distance(Point b){
		Integer type = isEuclidean;
		Float distance = null;
		Float distance2 = null;
		if(type == 1){
			distance = new Float((this.x - b.x)*(this.x - b.x) + (this.y - b.y)*(this.y - b.y));
			distance2 = new Float((this.x - b.x) + (this.y - b.y));
		}else{
			distance = new Float((this.x - b.x) + (this.y - b.y)); //Manhattan distance
			distance2 = new Float((this.x - b.x)*(this.x - b.x) + (this.y - b.y)*(this.y - b.y));
		}
		return distance;
	}
	
	void clone(Point b){
		Float x0 = new Float(this.x);
		Float y0 = new Float(this.y);
		Float x1 = new Float(this.x+1);
		Float y1 = new Float(this.y+1);
		b.x = x0;
		b.y = y0;
	}
}
public class TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a = new Point();
		Float x1 = new Float(5);
		a.x = x1;
		a.y = x1;
		
		Point b = new Point();
		Float x2 = new Float(4);
		b.x = x2;
		b.y = x2;
		
		Integer type = new Integer(1);
		Point.isEuclidean = type;
		
		Float dist = a.distance(b);
		a.clone(b);
	}

}

