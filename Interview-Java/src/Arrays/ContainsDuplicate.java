package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) 
                return true;
            else
                set.add(num);
        }
        return false;
    }

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1};
		ContainsDuplicate obj = new ContainsDuplicate();
		boolean ans = obj.containsDuplicate(arr);
		System.out.println(ans);
	}

}
