
public class App {

	public static void main(String[] args) {
		
		
		// Inefficient not changing string, creating new.
		String info = "";
		info += "My name is Adam.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		// using object and adding to it.  more efficient
		sb.append("My name is Adam.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger Ramjet");
		s.append(" ");									
		s.append("I am the hero of our nation");
		
		System.out.println(s.toString());
		
		/// Formatting ///
		
		System.out.println("Here is some text. \tThat was a tab.\nThat was a newline.");
		
		// Formatting integers
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for (int i=0; i< 20; i++) {
			System.out.printf("%2d: %s\n", i, "Count using formating");
		}
	
		System.out.printf("Total value: %.2f\n", 5.6183);
		System.out.printf("Total value: %-6.1f\n", 343.23432);
	}

}
