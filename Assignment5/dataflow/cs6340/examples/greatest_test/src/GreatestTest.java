public class GreatestTest {
	public static void main(String[] args) {
		int a = 2754, b = 7823, c = 5656;
		int a1 = 0, b1 = 0, c1 = 0;
		
		if(a > b){
			if (a > c){
				a1 = 1;
				b1 = 0;
				c1 = 0;	
			}else{
				a1 = 0;
				b1 = 0;
				c1 = 1;
			}
		}else{
			if(b > c){
				a1 = 0;
				b1 = 1;
				c1 = 0;
			}else{
				a1 = 0;
				b1 = 0;
				c1 = 1;
			}
			
		}
		
		a1 = a1 * 100;
		b1 = b1 * 100;
		c1 = c1 * 100;
		a = a * a1;
		b = b * b1;
		c = c * c1;
	}
}
