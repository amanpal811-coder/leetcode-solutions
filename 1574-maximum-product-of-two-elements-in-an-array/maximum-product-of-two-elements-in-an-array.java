class Solution {
    public int maxProduct(int[] nums) {
        int maxSum = nums[0];
        int result = 0;

        for(int i = 1; i < nums.length; i++){
            result = Math.max(result,(nums[i]-1)*(maxSum-1));
            maxSum = Math.max(maxSum,nums[i]);
        }
        return result;
    }
}