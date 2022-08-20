package Arrays;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		int[] array = {4, 5, 6, 7, 0, 1, 2, 3};
		int target = 7;
		System.out.println("Target found at index: " + rotatedSearch(array, target));
	}
	
	public static int rotatedSearch(int[] array, int target) {
		// Check if array is empty
		if (array.length < 1) return -1;
		
		//Search for the index of the smallest element
		int left = 0;
		int right = array.length - 1;
		while(left < right) {
			int middle = left + (right - left) / 2;
			
			if(array[middle] > array[right]) {
				left = middle + 1;
			} else
				right = middle;
		}
		
		int start = left;
		left = 0;
		right = array.length - 1;
		
		if (target >= array[start] && target <= array[right]) {
			left = start;
		} else 
			right = start - 1;
		
		// Regular binary search at this point
		while (left <= right) {
			int middle = left + (right - left) / 2;
			
			if(array[middle] == target) {
				return middle;
			} else if (array[middle] < target) {
				left = middle + 1;
			} else
				right = middle - 1;
		}
		
		return -1;
	}

}
