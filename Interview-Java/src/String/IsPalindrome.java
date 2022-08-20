package String;

public class IsPalindrome {

	public static void main(String[] args) {
		String word = "shamar";
		String word2 = "madam";
		
		System.out.println(isPalindrome(word)); 
		System.out.println(isPalindrome(word2)); 
		
		System.out.println(isPal(word)); 
		System.out.println(isPal(word2));
	}
	
	
	public static boolean isPal(String word) {
		int left = 0;
		int right = word.length() - 1;
		
		while (left < right) {
			if (word.charAt(left) == word.charAt(right)) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean isPalindrome(String word) {
		int a = 0;
		int b = word.length() - 1;
		while(a < b) {
			if (word.charAt(a) == word.charAt(b)) {
				a++;
				b--;
			} else {
				return false;
			}
		}
		return true;
	}
	

}
