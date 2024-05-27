
public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		plant2.grow();
		
		// calling the object.
		tree.shedLeaves();
		
		Plant plant3;
		
		// Error because depends of type of reference.  Variables no what types of methods.  Plant 2 is a plant not a tree.
		//plant2.shedLeaves();
		
		doGrow(tree);
	}

	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
