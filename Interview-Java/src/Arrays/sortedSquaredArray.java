package Arrays;

public class sortedSquaredArray {

	public static void main(String[] args) {
		int[] array = {-6, -4, 1, 2, 3, 5};
		int[] newArray = sortedSquared(array);
		printArray(array);
		System.out.println();
		printArray(newArray);
	}
	
	public static int[] sortedSquared(int[] array) {
		int[] returnArray = new int[array.length];
		int left = 0;
		int right = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (Math.abs(array[left]) > array[right]) {
				returnArray[i] = array[left] * array[left];
				left++;
			} else {
				returnArray[i] = array[right] * array[right];
				right--;
			}
		}
		return returnArray;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
