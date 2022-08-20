package Hash;
import java.util.*;
public class LastDuplicate {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8};
		System.out.println("Last Ducplicate: " + lastDuplicate(array));
	}
	
	public static int lastDuplicate(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();
		int lastDuplicate = -1;
		for(int i = 0; i < array.length; i++) {
			if (set.contains(array[i])) {
				lastDuplicate = array[i];
			} else
				set.add(array[i]);
		}
		
		return lastDuplicate;
		
	}

}
