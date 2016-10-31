class Coordinate{
	Float x;
	Float y;
	
	static Coordinate staticInner = new Coordinate();

	
	public Coordinate() {
	}
	public Coordinate(Float x) {
		this.x = x;
	}

	Float distance(Coordinate b){
		Integer type = 1;
		Float distance = null;
		Float distance2 = null;
		if(type == 1){
			distance = new Float((this.x - b.x)*(this.x - b.x) + (this.y - b.y)*(this.y - b.y));
			Coordinate.staticInner.x = distance;
			distance2 = new Float((this.x - b.x) + (this.y - b.y));
		}else{
			distance = new Float((this.x - b.x) + (this.y - b.y)); //Manhattan distance
			Coordinate.staticInner.x = distance;
			distance2 = new Float((this.x - b.x)*(this.x - b.x) + (this.y - b.y)*(this.y - b.y));
		}
		return distance2;
	}
	
	Coordinate returnsOneObjectReference(){
		Float x = new Float(0);
		Float y = new Float(0);
		Coordinate inner = new Coordinate(x);
		return inner;
	}
	
	void clone(Coordinate b){
		Float x0 = new Float(this.x);
		Float y0 = new Float(this.y);
		Float x1 = new Float(this.x+1);
		Float y1 = new Float(this.y+1);
		b.x = x0;
		b.y = y0;
	}
}
public class TestCase3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coordinate a = new Coordinate();
		Float x1 = new Float(5);
		a.x = x1;
		a.y = x1;
		
		Coordinate b = new Coordinate();
		Coordinate returnObjectReferences = b.returnsOneObjectReference();
		Float x2 = new Float(4);
		b.x = x2;
		b.y = x2;
		
		Float dist = a.distance(b);
		a.clone(b);
	}

}

