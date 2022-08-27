package Arrays;

import java.util.*;

public class InsertInterval {
	
	
	
	public int[][] insert(int[][] intervals, int[] newInterval) {
        // 1. create list
        List<int[]> lists = new LinkedList<>();
        // 2. add all lists that are less than new list
        int i = 0; int n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
            lists.add(intervals[i]);
            i++;
        }
        // 3. merge all overlapping lists
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        lists.add(newInterval);
        // 4. add the remaining lists 
        while (i < n) {
            lists.add(intervals[i]);
            i++;
        }
        // 5. return our list (as an array)
        return lists.toArray(new int[lists.size()][2]);
    }
	
	public static void printArray(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] intervals = {{1, 3}, {6, 9}};
		int[] newInterval = {2, 5};
		InsertInterval obj = new InsertInterval();
		int[][] ans = obj.insert(intervals, newInterval);
		printArray(ans);
	}

}
