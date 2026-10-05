class Solution {
    public List<Integer> findValidElements(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (i == 0 || i == n - 1) {
                result.add(nums[i]);
                continue;
            }

            boolean leftValid = true;
            boolean rightValid = true;

            // Check left side
            for (int j = 0; j < i; j++) {

                if (nums[i] <= nums[j]) {
                    leftValid = false;
                    break;
                }
            }

            // Check right side
            for (int j = i + 1; j < n; j++) {

                if (nums[i] <= nums[j]) {
                    rightValid = false;
                    break;
                }
            }

            if (leftValid || rightValid) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}