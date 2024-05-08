
import java.util.Random;

public class Application {
	public static void main(String[] args) {

		Random rand = new Random();

		int myInt = rand.nextInt(30);
		int loop = 0;
		int numLoops = rand.nextInt(30);

		while (loop < myInt) {

			if (loop == numLoops) {
				break;
			}

			loop++;
		}

		if (loop < 10) {
			System.out.println("Number of loops is less than 10: " + loop + " Random number: " + myInt);
		} else if (loop > 20) {
			System.out.println("Number of Loops is greater than 20: " + loop + " Random number: " + myInt);
		} else {
			System.out.println("Number of Loops is between 10 and 20: " + loop + " Random number: " + myInt);
		}

	}
}
