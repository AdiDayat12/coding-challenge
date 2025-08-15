class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 0) {
            return false;
        }
        double log4 = Math.log10(n) / Math.log10(4);
        double rounded = Math.round(log4);
        return Math.abs(log4 - rounded) < 1e-10;
    }
}