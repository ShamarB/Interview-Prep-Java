package Arrays;

public class LargestSumSubarray {

	public static void main(String[] args) {
		int[] array = {-4, 2, -5, 1, 2, 3, 6, -5, 1};
		System.out.println("Sum of largest sum array: " + findMaxSumSubarray(array));
	}
	
	public static int findMaxSumSubarray(int[] array) {
		if (array.length < 1) 
			return 0;
		
		int currMax = array[0];
		int globalMax = array[0];
		for (int i = 1; i < array.length; i++) {
			if (currMax < 0) {
				currMax = array[i];
			} else {
				currMax += array[i];
			}
			
			if (globalMax < currMax) {
				globalMax = currMax;
			}
		}
		return globalMax;
	}

}
