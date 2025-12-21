class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for(int num : nums) total += num;

        if((total - target) % 2 != 0 || total < target) return 0;
        int subsetSum = (total-target) / 2;
        return countSubsets(nums,subsetSum);
    }

    private int countSubsets(int[] nums,int sum){
        int[] dp = new int[sum+1];
        dp[0] = 1;

        for(int num : nums){
            for(int j = sum; j >= num; j--){
                dp[j] += dp[j - num];
            }
        }
        return dp[sum];
    }
}