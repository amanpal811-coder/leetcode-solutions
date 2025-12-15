class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][2];
        for (int i = 0; i < n; i++) {
            for (int b = 0; b < 2; b++) {
                for (int t = 0; t < 2; t++) {
                    dp[i][b][t] = -1;
                }
            }
        }

        return helper(prices,0,1,1,dp);
    }
    private int helper(int[] prices, int i, int buy, int transaction,int[][][] dp){
        if(i >= prices.length ||transaction <= 0){
            return 0;
        }

        if(dp[i][buy][transaction] != -1) return dp[i][buy][transaction];
        if(buy == 1){
            int take = -prices[i] + helper(prices, i + 1, 0, transaction, dp);
            int skip = helper(prices, i + 1, 1, transaction, dp);
            dp[i][buy][transaction] = Math.max(take, skip);
        }else{
            int sell = prices[i] + helper(prices, i + 1, 1, transaction - 1, dp);
            int skip = helper(prices, i + 1, 0, transaction, dp);
            dp[i][buy][transaction] = Math.max(sell, skip);
        }
        return dp[i][buy][transaction];

    }
}  