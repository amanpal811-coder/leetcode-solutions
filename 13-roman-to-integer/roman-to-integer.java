class Solution {

    public int romanToInt(String s) {

        int result = 0;
        int previous = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int current = getValue(s.charAt(i));

            if (current < previous) {
                result = result - current;
            } else {
                result = result + current;
            }

            previous = current;
        }

        return result;
    }

    public int getValue(char c) {

        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;

        return 0;
    }
}