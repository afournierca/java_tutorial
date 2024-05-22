class Frog {

	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		
		// using string formats
		return String.format("%-4d: %s", id, name);
		
		/* One method
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
	}

}

public class App {

	public static void main(String[] args) {

		// Object obj = new Object();

		// obj.

		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Roger");

		// if no toString will output object hash code
		System.out.println(frog1);
		System.out.println(frog2);
	}

}
