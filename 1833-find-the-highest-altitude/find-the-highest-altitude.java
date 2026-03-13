class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxSum = 0;
        int [] prefixSum = new int[n+1];
        prefixSum[0] = 0;
        for(int i = 1; i <= n; i++){
            prefixSum[i] = prefixSum[i-1] + gain[i-1];
            maxSum =  Math.max(maxSum,prefixSum[i]);
        }
        return maxSum;
    }
}