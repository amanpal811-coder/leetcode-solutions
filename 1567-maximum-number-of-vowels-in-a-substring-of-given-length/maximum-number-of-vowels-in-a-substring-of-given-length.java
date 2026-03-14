class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i < k; i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u'){
                count++;
            }   
        }
        int ans = count;

        for(int i = k; i < n; i++){
            char left = s.charAt(i-k);
            if(left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u'){
                count--;
            }
            char right = s.charAt(i);
            if(right == 'a' || right == 'e' || right == 'i' || right == 'o' || right == 'u'){
                count++;
            }
           ans = Math.max(ans,count);
        }
        

        return ans;
    }
}