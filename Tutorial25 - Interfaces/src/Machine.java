
// Extend class Machine to implement Info interface by adding   ... implements Info

public class Machine implements Info {
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine started!");
	}

	public void showInfo() {
		
		System.out.println("Machine ID is: " + id);
	}

}
