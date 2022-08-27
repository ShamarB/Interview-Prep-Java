// Problem description: 

package Graphs;

public class FloodFill {
	
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    
    public static void fill(int[][] image, int sr, int sc, int newColor, int color) {
        // if it's out of bounds or if the current block is not the same color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color)
            return;
        
        //change the current color to the new color and pass it on to the adjacent cells
        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, newColor, color);
        fill(image, sr, sc + 1, newColor, color);
        fill(image, sr - 1, sc, newColor, color);
        fill(image, sr, sc - 1, newColor, color);
    }
    
    public static void printArray(int[][] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[i].length; j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println();
    	}
    }

	public static void main(String[] args) {
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int sr = 1, sc = 1;
		int color = 2;
		FloodFill obj = new FloodFill();
		printArray(image);
		obj.floodFill(image, sr, sc, color);
		printArray(image);
	}

}
