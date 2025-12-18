class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        // Use Integer to allow null checks
        Integer[][][] dp = new Integer[n][2][k+1];
        return helper(prices, 0, 1, k, dp);
    }

    private int helper(int[] prices, int i, int buy, int cap, Integer[][][] dp) {
        if (i == prices.length) return 0;
        if (cap == 0) return 0;

        if (dp[i][buy][cap] != null) return dp[i][buy][cap];

        int profit;
        if (buy == 1) {
            int take = -prices[i] + helper(prices, i + 1, 0, cap, dp);
            int notTake = helper(prices, i + 1, 1, cap, dp);
            profit = Math.max(take, notTake);
        } else {
            int sell = prices[i] + helper(prices, i + 1, 1, cap - 1, dp);
            int notSell = helper(prices, i + 1, 0, cap, dp);
            profit = Math.max(sell, notSell);
        }

        return dp[i][buy][cap] = profit;
    }
}