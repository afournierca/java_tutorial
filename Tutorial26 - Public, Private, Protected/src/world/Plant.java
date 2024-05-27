package world;

public class Plant {

	// Bad practice. Should encapsulate
	public String name;

	// Constant are good public.. acceptable practice as long as it's final
	public final static int ID = 8;

	private String type;
	
	protected String size;

	// package level visibility
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
		this.height = 8;
	}
}
