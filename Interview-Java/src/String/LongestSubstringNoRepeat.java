/*
 * Longest substring without repeating characters
 */

package String;

import java.util.HashMap;

public class LongestSubstringNoRepeat {
	
	public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        
        int windowStart = 0;
        int maxLength = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            
            if (charIndexMap.containsKey(rightChar)) {
                windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);
            }
            
            charIndexMap.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

	public static void main(String[] args) {
		String s = "abcabcbb";
		LongestSubstringNoRepeat obj = new LongestSubstringNoRepeat();
		int ans = obj.lengthOfLongestSubstring(s);
		System.out.println(ans);
	}
}