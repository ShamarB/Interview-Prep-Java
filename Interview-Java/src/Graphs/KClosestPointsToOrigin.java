package Graphs;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
	
	public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((p1, p2) -> (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1]));
        
        for (int[] p : points) {
            maxHeap.add(p);
            if (maxHeap.size() > k) 
                maxHeap.poll();
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
	
	public static void printArray(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[][] points = {{1, 3}, {-2, 2}};
		KClosestPointsToOrigin obj = new KClosestPointsToOrigin();
		int[][] ans = obj.kClosest(points, 1);
		printArray(ans);
	}

}
