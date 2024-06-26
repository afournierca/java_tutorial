
public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		

		// Can do this because Machine implemented Info interface.  It will run the showInfo() methods.
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		System.out.println();
		
		outputInfo(mach1);
		outputInfo(person1);
		
		
	}

	// Can create a method that outputs the interface without having to create variable etc above.
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
