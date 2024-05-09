
public class Application {

	public static void main(String[] args) {
	
		int[] values;
		int size = 3;
		int start = 10;
		
		values = new int[size];	
		
		int[] numbers = {1,2,3};
		
		
		for(int i=0; i<values.length; i++) {
		
			if(i==0) {
				values[i] = 10;
			} else values[i] = values[i-1] + 10;
			
			System.out.println("Array Value at: " + numbers[i] + " equals: " + values[i]);
			
		}
	}

}
