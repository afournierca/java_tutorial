// Multi Dimensional arrays

public class App {

	public static void main(String[] args) {

		// Single dimensional
		
		int[] values = {3,5,2343};
		
		System.out.println(values[2]);

		// two dimensional array, array of arrays
		int[][] grid = {
				{3,5,2343},
				{2,4},
				{1,2,3,4}
		};
		
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		System.out.println(texts[0][1]);
		
		// loop over rows based upon the object grid length == rows
		// loop over columns base upon object grid current row length == grid[row].length  where row is the current index
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col<grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			
			System.out.println();
		}
		
		String[][] words = new String[3][];
		
		
		
	}

}
