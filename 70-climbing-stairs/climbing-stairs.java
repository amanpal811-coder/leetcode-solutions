class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return solve(n,0,dp);
    }

    private int solve(int n,int i, int[] dp){

        if(n<=3) return n;
        if(i > n) return 0;
        if(i == n) return 1;

        if(dp[i] != -1) return dp[i];
        dp[i] = solve(n,i+1,dp) + solve(n,i+2,dp);
        return dp[i];
        // return solve(n,i+1) + solve(n,i+2);
    }
}