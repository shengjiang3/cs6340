public class ComplexTest {
	public static void main(String[] args) {
		int[] a = new int[10000];
		long[] b = new long[10000];

		// assign a value to each array element 
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		long	temp = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0){ //Even
				for(int j = 0; j < a[i]; j++){
					temp += j;
				}
			}else{
				temp = 0;
			}
			
			b[i] = temp;
		}
		
	}
}
