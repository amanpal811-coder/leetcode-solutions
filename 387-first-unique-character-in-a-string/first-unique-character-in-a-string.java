class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            freq[c-'a']++;
            q.offer(new int[]{i,c});

            while(!q.isEmpty() && freq[q.peek()[1]-'a'] > 1){
                q.poll();
            }
        }
        return q.isEmpty() ? -1 : q.peek()[0];
    }
}