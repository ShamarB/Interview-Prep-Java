package String;
import java.util.*;
public class StringSegmentation {

	public static void main(String[] args) {
		String s = "applepeer";
		Set<String> dictionary = new HashSet<String>();
		dictionary.add("apple");
		dictionary.add("pear");
		dictionary.add("pier");
		dictionary.add("pie");
		
		System.out.println(canSegmentString(s, dictionary));
		
	}
	
	public static boolean canSegmentString(String s, Set <String> dictionary) {
		for (int i = 1; i <= s.length(); i++) {
			String first = s.substring(0, i);
			if (dictionary.contains(first)) {
				String second = s.substring(i);
				
				if (second == null || second.length() == 0 || dictionary.contains(second) || canSegmentString(second, dictionary)) {
					return true;
				}
			}
		}
		return false;
	}

}
