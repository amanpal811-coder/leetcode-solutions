class Solution {
    public String compressedString(String word) {

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < word.length()) {

            char ch = word.charAt(i);
            int count = 0;

            while (i < word.length() && word.charAt(i) == ch && count < 9) {
                count++;
                i++;
            }

            result.append(count);
            result.append(ch);
        }

        return result.toString();
    }
}