class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder bitStart = new StringBuilder(Integer.toBinaryString(start));
        StringBuilder bitGoal = new StringBuilder(Integer.toBinaryString(goal));

        int diff = 0;
        if (bitStart.length() > bitGoal.length()) {
            diff = bitStart.length() - bitGoal.length();
            addZeroes(bitGoal, diff);
        } else {
            diff = bitGoal.length() - bitStart.length();
            addZeroes(bitStart, diff);
        }

        int count = 0;

        for (int i = 0; i < bitGoal.length(); i++) {
            if (bitGoal.charAt(i) != bitStart.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    static void addZeroes (StringBuilder s, int len) {
        while (len > 0) {
            s.insert(0, "0");
            len--;
        }
    }
}