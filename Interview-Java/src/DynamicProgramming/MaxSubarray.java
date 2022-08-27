/*
Problem Description: Given an integer array nums, 
find the contiguous subarray (containing at least one number) 
which has the largest sum and return its sum.
*/

package DynamicProgramming;

public class MaxSubarray {
	
	public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length;i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            max = Math.max(currentSum, max);
        }
        return max;
    }

	public static void main(String[] args) {
		MaxSubarray obj = new MaxSubarray();
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = obj.maxSubArray(arr);
		System.out.println(ans);
	}
}
