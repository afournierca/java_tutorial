// Setters and 'this' keyword -- reference to the object you are in.

class Frog {
	
	// hides these variables so it cannot be accessed directly.  called encapsulation
	
	private String name;
	private int age;
	
	public void setName(String name) {
		
		// to use instance variables use this.name = name (parameter)
		this.name = name;
	}
	
	// this --> reference to object you are in
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
}
public class App {

	public static void main(String[] args) {
	
		Frog frog1 = new Frog();
	//	frog1.name = "Bertie";
	//	frog1.age = 1;
		
	//	frog1.setName("Bertie");
	//	frog1.setAge(1);
		
		frog1.setInfo("Bertie", 1);
		System.out.println(frog1.getName() + " : " + frog1.getAge());

	}

}
