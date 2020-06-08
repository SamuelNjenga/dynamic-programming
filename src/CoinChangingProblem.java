import java.util.Arrays;

public class CoinChangingProblem {
    public static int coinChange(int[] coins, int amount) {
        //Sort coins
        Arrays.sort(coins);
        int[] dp = new int[amount + 1]; //It is zero based
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;//Fewest number of coins to make 0 amount
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }else{
                    break;
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int coins[] = new int[]{25, 10, 5};
        int amount = 30;
        System.out.println(coinChange(coins, amount));
    }
}
