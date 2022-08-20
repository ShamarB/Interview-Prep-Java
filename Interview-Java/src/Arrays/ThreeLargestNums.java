package Arrays;

public class ThreeLargestNums {

	public static void main(String[] args) {
		int[] array = {5, 15, 0, 1, 20, 12, 200};
		int[] ans = threeLargest(array);
		printArray(ans);
	}
	
	public static int[] threeLargest(int[] array) {
		int[] returnArray = {0,0,0};
		for (int i = 0; i < array.length; i++) {
			if (array[i] > returnArray[0]) {
				place(array[i], returnArray);
			}
		}
		
		return returnArray;
	}
	
	public static void place(int num, int[] array) {
		//largest number
		if (num > array[2]) {
			array[0] = array[1];
			array[1] = array[2];
			array[2] = num;
		} else if (num > array[1]) {
			array[0] = array[1];
			array[1] = num;
		} else {
			array[0] = num;
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
