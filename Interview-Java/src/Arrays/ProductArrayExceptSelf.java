package Arrays;

public class ProductArrayExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        
        int[] output = new int[n];
        
        output[0] = 1;
        
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        int R = 1;
        for(int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * R;
            R = R * nums[i];
        }
        
        return output;
        
        
        
//         int[] leftProducts = new int[n];
//         int[] rightProducts = new int[n];
        
//         int[] output = new int[n];
        
//         leftProducts[0] = 1;
//         rightProducts[n - 1] = 1;
        
//         for (int i = 1; i < n; i++) {
//             leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
//         }
//         for(int i = n - 2; i >= 0; i--) {
//             rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
//         }
//         for (int i = 0; i < n; i++) {
//             output[i] = leftProducts[i] * rightProducts[i];
//         }
        // return output;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		ProductArrayExceptSelf obj = new ProductArrayExceptSelf();
		int[] ans = obj.productExceptSelf(arr);
		System.out.println(ans);
	}

}
