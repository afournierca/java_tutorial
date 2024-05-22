
public class Machine {

	// protected can be accessed anywhere in package and child class
	protected String name = "Machine Type 1";
	
	public void start() {
		System.out.println("Machine started");
	}

	public void stop() {
		System.out.println("Machine stopped");
	}
}
