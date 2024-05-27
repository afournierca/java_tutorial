package world;

public class Oak extends Plant {
	
	public Oak() {
		
		// won't work type is private
		// type = "tree";
		
		// size is protected so you can access in the package and it's class and subclasses.
		this.size = "large";
		
		// no access specifier; works because Oak and Plant in the same package.
		this.height = 10;
		
		
	}

}
