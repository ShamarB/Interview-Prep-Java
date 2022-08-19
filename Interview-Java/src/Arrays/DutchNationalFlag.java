package Arrays;

public class DutchNationalFlag {

	public static void main(String[] args) {
		int[] array = {2, 0, 2, 1, 1, 0};
		DNF(array);
		printArray(array);
	}
	
	public static int[] DNF(int[] array) {
		int low = 0;
		int mid = 0;
		int high = array.length - 1;
		
		while (mid <= high) {
			if (array[mid] == 0) {
				swap(array, low, mid);
				low++;
				mid++;
			} else if (array[mid] == 1) {
				mid++;
			} else if (array[mid] == 2) {
				swap(array, mid, high);
				high--;
			}
		}
		return array;
	}
	
	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
// 1 0 2 1 0
// 0 1 2 1 0
// 0 0 1 1 2