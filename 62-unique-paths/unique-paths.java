class Solution {
     int [][] dp ;
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        return dfs(m,n);
    }

    private int dfs(int m,int n){
        if(m == 1 || n == 1) return 1;

        if(dp[m][n] != 0) return dp[m][n];
        dp[m][n] = dfs(m-1,n) + dfs(m,n-1);
        return dp[m][n];
    }

}