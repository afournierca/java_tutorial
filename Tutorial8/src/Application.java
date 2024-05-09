import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int value = 0;
		
		/*
		System.out.println("Guess number: ");
		int value = scanner.nextInt();
		
		while(value |= 5) {
			System.out.println("Guess again: ");
			value = scanner.nextInt();	
		}
		*/
		
		
		do {
			if(value == 0) {
				System.out.println("Guess number: ");
			} else System.out.println("Guess again: ");
			
			value = scanner.nextInt();
			
		}
		while(value != 5);
		
		System.out.println("Correct Guess: 5");
	}

}
