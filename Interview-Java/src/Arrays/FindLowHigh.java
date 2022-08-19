package Arrays;


public class FindLowHigh {

	public static void main(String[] args) {
		int[] array = {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6};
		int key = 5;
		System.out.println("Low Index of " + key + ": " + findLowIndex(array, key));
		System.out.println("High Index of " + key + ": " + findHighIndex(array, key));
	}
	
	public static int findLowIndex(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		int mid = high / 2;
		
		while (low <= high) { 
			int midElem = array[mid];
			
			if (midElem < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			
			mid = low + (high - low) / 2;
		}
		
		if (low < array.length && array[low] == key) {
			return low;
		}
		
		return -1;
	}
	
	public static int findHighIndex(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		int mid = high / 2;
		
		while (low <= high) {
			int midElem = array[mid];
			
			if (midElem <= key) {
				low = mid + 1;
			} else
				high = mid - 1;
			
			mid = low + (high - low) / 2;
		}
		
		if (high == -1)
			return high;
		
		if (high < array.length && array[high] == key)
			return high;
		
		
		return -1;
	}

}
