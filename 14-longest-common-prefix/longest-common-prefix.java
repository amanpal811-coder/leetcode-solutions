class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String i = strs[0];
        String j = strs[n-1];
        int k = 0;
        while(k < i.length() && k < j.length() && i.charAt(k) == j.charAt(k)){
            k++;
        }
        return i.substring(0,k);
    }
}