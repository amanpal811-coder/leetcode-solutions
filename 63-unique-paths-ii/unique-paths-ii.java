class Solution {

    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }

        return solve(grid, 0, 0, dp);
    }

    public int solve(int[][] grid, int i, int j, int[][] dp){

        int m = grid.length;
        int n = grid[0].length;

        if(i >= m || j >= n)
            return 0;

        if(grid[i][j] == 1)
            return 0;

        if(i == m-1 && j == n-1)
            return 1;

        if(dp[i][j] != -1)
            return dp[i][j];

        int right = solve(grid, i, j+1, dp);
        int down = solve(grid, i+1, j, dp);

        dp[i][j] = right + down;

        return dp[i][j];
    }
}