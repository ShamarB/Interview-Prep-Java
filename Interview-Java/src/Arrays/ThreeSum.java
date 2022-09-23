package Arrays;
import java.util.*;

public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> triplets = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
		    if (i > 0 && nums[i] == nums[i - 1]) 
			continue;
		    searchPairs(nums, i, triplets);
		}
		return triplets;
	}
   
	public static void searchPairs(int[] nums, int i, List<List<Integer>> triplets) {
		int left = i + 1;
		int right = nums.length - 1;
		while (left < right) {
		    if (nums[i] + nums[left] + nums[right] < 0) {
			left++;
		    } else if (nums[i] + nums[left] + nums[right] > 0) {
			right--;
		    } else {
			triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
			left++;
			while (left < right && nums[left] == nums[left - 1])
			    left++;
			right--;
			while (left < right && nums[right] == nums[right + 1])
			    right--;
		    }
		}
    	}

	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		ThreeSum obj = new ThreeSum();
		List<List<Integer>> ans = obj.threeSum(arr);
		System.out.println(ans);
	}

}
