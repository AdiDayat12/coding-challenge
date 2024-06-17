class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        int [] divider = {2, 3, 5};
        
        for (int div : divider){
            while (n % div == 0){
                n  /= div;
            }
        }

        return n == 1;
    }
}