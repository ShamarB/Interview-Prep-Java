package String;

public class reverseString {

	public static void main(String[] args) {
		char[] word = {'s', 'h', 'a', 'm', 'a', 'r'};
		printArray(word);
		reverse(word);
		printArray(word);
		
		String word2 = "Shamar";
		System.out.println("Original word: " + word2);
		System.out.println("Reversed word: " + reverse2(word2));
	}
	
	public static char[] reverse(char[] word) {
		int left = 0;
		int right = word.length - 1;
		while (left <= right) {
			char temp = word[left];
			word[left] = word[right];
			word[right] = temp;
			left++;
			right--;
		}
		return word;
	}
	
	public static String reverse2(String word) {
		char[] letters = new char[word.length()];
		 int lettersIndex = 0;
		 for (int i = word.length() - 1; i >= 0; i--) {
			 letters[lettersIndex] = word.charAt(i);
			 lettersIndex++;
		 }
		 
		 String reverse = "";
		 for (int i = 0; i < word.length(); i++) {
			 reverse += letters[i];
		 }
		 return reverse;
		
	}
	
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
