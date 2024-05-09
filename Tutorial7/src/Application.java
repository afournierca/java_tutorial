import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		// Create scanner objecty
		Scanner input = new Scanner(System.in);
		
		// Output user prompt
		System.out.println("Enter a line of text: ");
		
		// Wait for user input
		String line = input.nextLine();
		
		// Output what user typed
		System.out.println("You entered: " + line);
		
		// Output prompt
		System.out.println("Enter an integer: ");
		int value = input.nextInt();
		
		//Output what user typed
		System.out.println("You entered value: " + value);
	}
}
