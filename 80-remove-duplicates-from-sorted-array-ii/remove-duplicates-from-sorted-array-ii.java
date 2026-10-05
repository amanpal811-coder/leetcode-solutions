class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 1;
        result.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                count+=1;
            }else{
                count = 1;
            }

            if(count <= 2){
                result.add(nums[i]);
            }
            for (int j = 0; j < result.size(); j++) {
            nums[j] = result.get(j);
        }
        }
        return result.size();
    }
}