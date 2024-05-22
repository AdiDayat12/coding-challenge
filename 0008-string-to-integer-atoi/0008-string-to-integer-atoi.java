class Solution {
    public static int myAtoi(String s) {
        String word = s.trim();
        if (word.isEmpty()){
            return 0;
        }
        if (!Character.isDigit(word.charAt(0)) && word.charAt(0) != '-' && word.charAt(0) != '+'){
            return 0;
        }
        long x = 0;
        int startIndex = 0;
        boolean isNegative = false;
        if (word.charAt(0) == '-'){
            startIndex = 1;
            isNegative = true;
        }
        if (word.charAt(0) == '+'){
            startIndex = 1;
        }

        for (int i = startIndex; i < word.length() ; i++) {
            char c = word.charAt(i);
            if (Character.isDigit(c)){
                x = x * 10 + (c - '0');
                 if (isNegative && -x < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if (!isNegative && x > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            }else {
                break;
            }
        }
        return isNegative ? (int) -x : (int) x;
    }
}