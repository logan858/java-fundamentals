package tuts11;

public class Appies {
	public static void main(String[] args) {
		int[] values = {3, 5, 349};
		System.out.println(values[2]);
		
		// multi dimensional arrays:
		int[][] grid = { 
			{3, 5, 349},
			{67, 2, 90, 35, 4},
			{56, 12}
		}; 
		System.out.println(grid[1][2]);
		
		String[][] texts = new String[2][3];
		texts[0][1] = "hello there!";
		System.out.println(texts[0][1]);
	
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + "\s");
			}
			System.out.println();
		}
		
		
		String[][] words = new String[2][];
		System.out.println(words[0]);
		words[0] = new String[3];
		words[0][2] = "Hiya, it's me, Imoen!";
		System.out.println(words[0][2]);
	}

}
