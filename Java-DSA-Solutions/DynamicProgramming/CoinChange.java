public class CoinChange {
    public static int coinChange(int[] coins, int amount){ int[] dp=new int[amount+1]; java.util.Arrays.fill(dp, amount+1); dp[0]=0; for(int c:coins) for(int i=c;i<=amount;i++) dp[i]=Math.min(dp[i], dp[i-c]+1); return dp[amount]>amount?-1:dp[amount]; }
    public static void main(String[] args){ System.out.println(coinChange(new int[]{1,2,5}, 11)); }
}
