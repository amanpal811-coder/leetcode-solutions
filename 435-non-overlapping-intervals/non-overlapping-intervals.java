class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int prev = intervals[0][1];
        for(int i = 0; i < intervals.length; i++){
            if(prev <= intervals[i][0]){
                prev = intervals[i][1];
                count++;
            }
        }
        return intervals.length-count;
    }
}