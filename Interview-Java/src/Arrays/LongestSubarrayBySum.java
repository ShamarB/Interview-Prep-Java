package Arrays;

public class LongestSubarrayBySum {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10};
		int[] ans = longestSub(array, 15);
		printArray(ans);

	}
	
	public static int[] longestSub(int[] array, int targetSum) {
		int[] ans = new int[] {-1};
		int left = 0;
		int right = 0;
		int sum = 0;
		
		while(right < array.length) {
			sum += array[right];
			while(left < right && sum > targetSum) {
				sum -= array[left++];
			}
			if(sum == targetSum && (ans.length == 1 || (right - left) > ans[1] - ans[0])) {
				ans = new int[] {left, right};
			}
			right++;
		}
		
		return ans;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
