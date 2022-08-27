package String;

import java.util.HashSet;

public class LongestPalindrome {
	
	public int longestPalindrome(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (charSet.contains(c)){
                charSet.remove(c);
                count++;
            }
            else
                charSet.add(c);
        }
        if (charSet.isEmpty()) {
            return count * 2;
        } else {
            return count * 2 + 1;
        }
    }

	public static void main(String[] args) {
		LongestPalindrome obj = new LongestPalindrome();
		String s = "abccccdd";
		int ans = obj.longestPalindrome(s);
		System.out.println(ans);
	}
}
