class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 0) {
            return false;
        }
        double log3 = Math.log10(n) / Math.log10(3);
        double rounded = Math.round(log3);
        return Math.abs(log3 - rounded) < 1e-10;    
    }
    
}