package Arrays;

public class BinarySearch {
	
	public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
            mid = left + (right - left) / 2;
        }
        return -1;
    }

	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		int[] arr = {-1,0,3,5,9,12};
		int ans = obj.search(arr, 0);
		System.out.println(ans);
	}
}
