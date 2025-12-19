class Solution {
    public boolean isPalindrome(String s) {
        return helper(s.toLowerCase(),0,s.length()-1);
    }
    private boolean helper(String s,int left,int right){
        if(left >= right) return true;

        char cLeft = s.charAt(left);
        char cRight = s.charAt(right);

        if (!Character.isLetterOrDigit(cLeft)) {
            return helper(s, left + 1, right);
        }

        if (!Character.isLetterOrDigit(cRight)) {
            return helper(s, left, right - 1);
        }

        if (cLeft != cRight) return false;

        return helper(s, left + 1, right - 1);

    }
}