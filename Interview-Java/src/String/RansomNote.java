package String;

import java.util.HashMap;

public class RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charFreqMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (charFreqMap.containsKey(c)) {
                charFreqMap.put(c, charFreqMap.get(c) - 1);
                if (charFreqMap.get(c) == 0)
                    charFreqMap.remove(c);
            }
            else {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		RansomNote obj = new RansomNote();
		String note = "aa";
		String mag = "aab";
		boolean ans = obj.canConstruct(note, mag);
		System.out.println(ans);
	}
}
