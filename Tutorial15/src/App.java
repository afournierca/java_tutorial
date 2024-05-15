class Person {
	String name;
	int age;
	
	// void method does not return anything
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	
	// Return int
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}


public class App {

	public static void main(String[] args) {
		


		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 25;
		
		//person1.speak();
		int years = person1.calculateYearsToRetirement();
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println("My name is: " + name);
		System.out.println("Years to retirement: " + years);
		System.out.println("I am " + age + " years old!");
	}

}
