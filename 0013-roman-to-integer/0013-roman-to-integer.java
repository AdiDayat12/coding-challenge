class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length()) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    result += 4;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    result += 9;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    result += 40;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    result += 90;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    result += 400;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    result += 900;
                    i += 2;
                    continue;
                }
            }
            if (s.charAt(i) == 'I') {
                result += 1;
            } else if (s.charAt(i) == 'V') {
                result += 5;
            } else if (s.charAt(i) == 'X') {
                result += 10;
            } else if (s.charAt(i) == 'L') {
                result += 50;
            } else if (s.charAt(i) == 'C') {
                result += 100;
            } else if (s.charAt(i) == 'D') {
                result += 500;
            } else if (s.charAt(i) == 'M') {
                result += 1000;
            }
            i++;
        }
        return result;
    }
}