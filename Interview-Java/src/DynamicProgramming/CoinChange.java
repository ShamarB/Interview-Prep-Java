package DynamicProgramming;
import java.util.*;

public class CoinChange {
	
	public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        //Arrays.sort(coins);
        dp[0] = 0;
        
        for (int i = 0; i <= amount; i++) { //come back
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) { //coin is eligible to be used
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]); // [1 2 5] dp=[0 1 1 2 2]
                }
            //     } else {
            //         break;
            //     }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;
		CoinChange obj = new CoinChange();
		int ans = obj.coinChange(coins, amount);
		System.out.println(ans);
	}
}
