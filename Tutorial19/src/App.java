
class Thing {
	public final static int LUCKY_NUMBER = 7; // cannot be reassigned constant
	public String name;
	public static String description; // one copy for the class

	public static int count = 0;
	public int id;
	
	// count number of Thing objects created
	public Thing() {
		// use count for unique id at time of running application
		id = count;
		count++;
	}
	
	public void showName() {
		System.out.println("Object id: " + id + ", " + description + ": " + name);
	}

	// can only show static info
	public static void showInfo() {
		System.out.println(description);
		// won't work System.out.println(name);
	}
}

public class App {

	public static void main(String[] args) {

		Thing.description = "I am a thing";

		Thing.showInfo();

		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		System.out.println("After creating objects, count is: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";

		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER); // Constants in upper case
	}

}
