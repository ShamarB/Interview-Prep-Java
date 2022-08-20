package Arrays;

public class FindMissingArray {

	public static void main(String[] args) {
		int[] array = {1, 2, 4, 6, 3, 7, 8};
		System.out.println("Missing Number: " + findMissingNumber(array));
	}
	
	public static int findMissingNumber(int[] array) {
		int n = array[array.length - 1];
		int expectedSum = (n * (n + 1)) / 2;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return expectedSum - sum;
	}

}
