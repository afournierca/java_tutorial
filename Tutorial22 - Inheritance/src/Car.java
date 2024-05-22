
public class Car extends Machine {

	// Override checks that the parent class has the method
	@Override
	public void start() {
		System.out.println("Car started");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	
	// Private machine method not visible in other classes even inherited
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
