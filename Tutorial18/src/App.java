// Constructors does not need return time and must have same name as class.  Use to initialize object
// you can constructors within constructors...

class Machine {

	// Initialize variable that can be used by more than on constructor
	private String name;
	private int code;

	public Machine() {
		
		this("Arnie",0); // Must be first line 
		System.out.println("First Constructor completed!");

//		name = "Arnie";
		
		
	}

	public Machine(String name) {
		System.out.println("Second constructor running");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
	
	
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
	//	Machine machine2 = new Machine("Bertie");
	//	Machine machine3 = new Machine("Chalky", 5);
		
	}

}
