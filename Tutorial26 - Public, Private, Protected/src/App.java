import world.Plant;

/*
Public - anywhere
Private - only within same class
Protected - subclass and package
no modifier - same package
*/

public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// wont work because type is private
		// System.out.println(plant.type);

		// size is protected; App is not in the same package as Plant.  Won't work
		// System.out.println(plant.size);
		//System.out.println(plant.height);
	}

}
