class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int ans = solve(coins,amount,0,dp);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }else{
           return ans;
        }

    }
    private int solve(int[] coins, int amount,int i,int[][] dp){
        int n = coins.length;
        if(amount == 0) return 0;
        if(i == n) return Integer.MAX_VALUE;
        if (dp[i][amount] != -1) return dp[i][amount];

        int take = Integer.MAX_VALUE;
        if(coins[i] <= amount){
            int res = solve(coins,amount - coins[i],i,dp);
            if(res != Integer.MAX_VALUE) take = 1 + res;
        }
        int nottake = solve(coins,amount,i+1,dp);
        return dp[i][amount] = Math.min(take,nottake);
    }
}