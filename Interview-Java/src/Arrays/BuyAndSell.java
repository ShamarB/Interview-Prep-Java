package Arrays;

public class BuyAndSell {
	
	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            } else if (prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;
    }

	public static void main(String[] args) {
		BuyAndSell obj = new BuyAndSell();
		int[] arr = {7,1,5,3,6,4};
		int ans = obj.maxProfit(arr);
		System.out.println(ans);
	}
}
