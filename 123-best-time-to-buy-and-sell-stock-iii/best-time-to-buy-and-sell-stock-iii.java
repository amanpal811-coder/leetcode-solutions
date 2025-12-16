class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3];
        for (int i = n-1; i >= 0; i--) {
            for (int buy = 0; buy <= 1; buy++) {
                for(int cap = 1; cap <= 2; cap++){
                    if(buy == 1){
                        dp[i][buy][cap] = Math.max(-prices[i] + dp[i+1][0][cap],dp[i+1][1][cap]);
                    }else{
                        dp[i][buy][cap] = Math.max(prices[i]+ dp[i+1][1][cap-1],dp[i+1][0][cap]);
                    }
                }
            
            }
        }
        return dp[0][1][2];

    // private int helper(int[] prices,int i,int buy,int cap){
    //     if(i == prices.length) return 0;
    //     if(cap == 0) return 0;

    //     if(buy==1){
    //         return Math.max(-prices[i] + helper(prices,i+1,0,cap), helper(prices,i+1,1,cap));
    //     }else{
    //         return Math.max(prices[i] + helper(prices,i+1,1,cap-1),helper(prices,i+1,0,cap));
    //     }
     }
}