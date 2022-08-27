package Graphs;

public class O1Matrix {

	public int[][] updateMatrix(int[][] updateMatrix) {
        int[][] distance = new int[updateMatrix.length][updateMatrix[0].length];
        int maxPossibleDistance = updateMatrix.length - 1 + updateMatrix[0].length - 1;
        
        for(int i = 0; i < updateMatrix.length; i++) {
            for (int j = 0; j < updateMatrix[0].length; j++) {
                if (updateMatrix[i][j] != 0) {
                    int upCell = (i > 0) ? distance[i - 1][j] : maxPossibleDistance;
                    int leftCell = (j > 0) ? distance[i][j - 1] : maxPossibleDistance;
                    distance[i][j] = Math.min(upCell, leftCell) + 1;
                }
            }
        }
            
        for (int i = updateMatrix.length - 1; i >= 0; i--) {
            for (int j = updateMatrix[0].length - 1; j >= 0; j--) {
                if (updateMatrix[i][j] != 0) {
                    int downCell = (i < updateMatrix.length - 1) ? distance[i + 1][j] : maxPossibleDistance;
                    int rightCell = (j < updateMatrix[0].length - 1) ? distance[i][j + 1] : maxPossibleDistance;
                    distance[i][j] = Math.min(Math.min(downCell, rightCell) + 1, distance[i][j]);
                }
            }
        }
        return distance;
    }
	
	public static void printArray(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
		O1Matrix obj = new O1Matrix();
		int[][] ans = obj.updateMatrix(matrix);
		printArray(ans);
	}

}
