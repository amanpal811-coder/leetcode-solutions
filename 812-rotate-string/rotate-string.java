class Solution {
    public boolean rotateString(String s, String goal) {

        int n = s.length();

        if (n != goal.length()) {
            return false;
        }

        for (int k = 0; k < n; k++) {

            char[] arr = s.toCharArray();

            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);

            if (new String(arr).equals(goal)) {
                return true;
            }
        }

        return false;
    }

    public void reverse(char[] s, int left, int right) {

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}