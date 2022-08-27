package Arrays;
import java.util.*;
public class FirstDuplicate {

	public static void main(String[] args) {
		int[] array = {3, 45, 32, 45, 2, 4, 5, 6, 3};
		System.out.println(firstDup(array));
	}
	
	public static int firstDup(int[] array) {
		HashSet<Integer> newSet = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (newSet.contains(array[i])) {
				return array[i];
			} else {
				newSet.add(array[i]);
			}
		}
		return -1;
		
	}
	public static int firstDuplicate(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (set.contains(array[i])) {
				return array[i];
			} else 
				set.add(array[i]);
		}
		return -1;
	}
}
