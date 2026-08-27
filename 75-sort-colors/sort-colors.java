class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count 0, 1 and 2
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) count0++;
            else if (nums[i] == 1) count1++;
            else count2++;
        }

        int i = 0;

        // Fill 0
        while (i < count0) {
            nums[i] = 0;
            i++;
        }

        // Fill 1
        while (i < count0 + count1) {
            nums[i] = 1;
            i++;
        }

        // Fill 2
        while (i < n) {
            nums[i] = 2;
            i++;
        }
    }
}