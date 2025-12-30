class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        int duplicate = -1;

        for(int num : nums){
            if(!seen.add(num)){
                duplicate = num;
            }
        }
        for(int i = 1; i <= n; i++ ){
            if(!seen.contains(i)){
                return new int[]{duplicate,i};
            }
        }
        return new int[]{-1,-1};
    }
}