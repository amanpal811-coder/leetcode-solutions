class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low = 0;
        int high = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (high = 0; high < nums.length; high++) {

            sum += nums[high];

            while (sum >= target) {

                int currLength = high - low + 1;

                minLength = Math.min(currLength, minLength);

                sum -= nums[low];

                low++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}