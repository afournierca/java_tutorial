import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started");
			break;
		case "stop":
			System.out.println("Machine stopped");
			break;
		case "suspend":
			System.out.println("Machine suspended");
			break;

		default:
			System.out.println("Command not recognized");
		}
	}

}
