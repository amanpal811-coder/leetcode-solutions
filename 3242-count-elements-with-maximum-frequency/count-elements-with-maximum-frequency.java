class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int maxfreq = 0;
        int total = 0;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
            int freq = map.get(num);
            if(freq > maxfreq){
                maxfreq = freq;
                total = freq;
            }else if(freq == maxfreq){
                total += maxfreq;
            }
        }
        return total;
    }
}