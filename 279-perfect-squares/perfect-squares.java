class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    private int helper(int n, int[] dp){
        if(n == 0) return 0;

        if(dp[n] != -1) return dp[n];
        int minSteps = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n; i++ ){
            int square = i*i;
            minSteps = Math.min(minSteps, 1 + helper(n - square, dp));

        }
        dp[n] = minSteps;
        return minSteps;
    }
}