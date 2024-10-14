class Solution {
    public String greatestLetter(String s) {
        int lowerMask = 0;
        int upperMask = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)){
                lowerMask |= (1 << (c - 'a'));
            } else if (Character.isUpperCase(c)) {
                upperMask |= (1 << (c - 'A'));
            }
        }

        for (int i = 25; i >= 0; i--) {
        if ((lowerMask & (1 << i)) != 0 && (upperMask & (1 << i)) != 0) {
            return String.valueOf((char) ('A' + i));
        }
    }
        return "";
    }
}