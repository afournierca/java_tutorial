// Represents an idea of a person
class Person {
	// Classes can contain
	// 1. Data (Instance variables or state)

	String name;
	int age;

	// 2. Subroutines (methods)

	void speak() {
		System.out.println("My Name is " + name + " I am " + age + " years old");
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe Blow";
		person1.age = 37;
		person1.sayHello();
		person1.speak();

		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		person2.sayHello();
		person2.speak();
	
	}

}
