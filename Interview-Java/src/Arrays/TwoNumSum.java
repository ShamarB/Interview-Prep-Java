package Arrays;

import java.util.Arrays;

public class TwoNumSum {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		boolean ans = twoNumSum(array, 21);
		System.out.println(ans);
		
//		Integer[] arr = twoNumSum2(array, 17);
//		System.out.println(arr.toString());
	}

	
	
	public static boolean twoNumSum(int[] array, int targetNum) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int currentNum = array[left] + array[right];
			if (currentNum > targetNum) {
				right--;
			} else if (currentNum < targetNum) {
				left++;
			} else return true;
		}
		return false;
	}
	
	public static Integer[] twoNumSum2(int[] array, int targetNum) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while(left < right) {
			int currentNum = array[left] + array[right];
			if (currentNum > targetNum) {
				right--;
			} else if (currentNum < targetNum) {
				left++;
			} else {
				return new Integer[] {array[left], array[right]};
			}
		}
		return new Integer[] {-1, -1};
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
