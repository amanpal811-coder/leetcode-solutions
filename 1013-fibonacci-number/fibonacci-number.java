class Solution {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);  // initialize all with -1
        return helper(n, dp);
    }

    private int helper(int n, int[] dp) {
        if (n == 0 || n == 1) return n;

        if (dp[n] != -1) return dp[n];

        int num1 = helper(n - 1, dp);
        int num2 = helper(n - 2, dp);

        return dp[n] = num1 + num2;
    }
}