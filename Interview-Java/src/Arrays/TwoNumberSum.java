package Arrays;
import java.util.*;
public class TwoNumberSum {

	public static void main(String[] args) {
		int[] array = {5, 7, 1, 2, 8, 4, 3};
		System.out.println(twoNumSum(array, 8));
	}
	
	public static boolean twoNumSum(int[] array, int targetSum) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (set.contains(targetSum - array[i])) {
				return true;
			} else
				set.add(array[i]);
		}
		return false;
	}

}
