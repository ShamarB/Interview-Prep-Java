package Arrays;

public class IsPalindromeNum {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 3, 2, 1};
		
		boolean ans = isPalindrome(array);
		System.out.println(ans);
		
	}
	
	public static boolean isPalindrome(int[] array) {
		int a = 0;
		int b = array.length - 1;
		while(a < b) {
			if (array[a] == array[b]) {
				a++;
				b--;
			} else {
				return false;
			}
		}
		return true;
	}

}
