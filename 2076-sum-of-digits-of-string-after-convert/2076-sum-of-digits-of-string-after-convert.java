class Solution {
    public static int getLucky(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            stringBuilder.append(c - 'a' + 1);
        }
        if (k == 0) {
            return (int) Long.parseLong(stringBuilder.toString());
        }

        long value = 0;
        for (char c : s.toCharArray()){
            int x = c - 'a' + 1;
            if (x > 9) {
                int mod = x % 10;
                int y = x / 10;
                value += mod + y;
            } else {
                value += x;
            }
        }
        if (k == 1) {
            return (int) value;
        }

        int i = 1;
        while ( i < k) {
            value = solution(value);
            i++;
        }
        return (int) value;
    }

    static long solution (long value) {
        long result = 0;
        while (value > 0) {
            long x = value % 10;
            result += x;
            value /= 10;
        }
        return result;
    }
}