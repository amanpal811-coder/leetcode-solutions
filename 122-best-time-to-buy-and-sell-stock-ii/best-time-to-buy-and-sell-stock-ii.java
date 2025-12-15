class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for (int i = 0; i < n; i++) {
            for (int b = 0; b < 2; b++) {
                dp[i][b] = -1;
            }
        }
        return helper(prices,0,1,dp);
    }
    private int helper(int[] prices, int i, int buy,int[][] dp){
        if(i >= prices.length){
            return 0;
        }
        if(dp[i][buy] != -1) return dp[i][buy];
        if(buy == 1){
            int take = -prices[i]+helper(prices,i+1,0,dp);
            int skip = helper(prices,i+1,1,dp);
            dp[i][buy] =  Math.max(take,skip);
            return dp[i][buy];
        }else{
            int sell = prices[i]+helper(prices,i+1,1,dp);
            int skip = helper(prices,i+1,0,dp);
            dp[i][buy] = Math.max(sell,skip);
            return dp[i][buy];
        }

    }
} 