class Solution {
    public int differenceOfSums(int n, int m) {
        if (n == 0) {
            return -m;
        }
        int total = 0;
        int totalDivisible = 0;
        for (int i = 1; i <= n; i++){
            total += i;
            if (i % m == 0) {
                totalDivisible += i;
            }
        }
        if (m == 1) {
            return -total;
        }
        if (m > n) {
            return total;
        }
        return total - (2 * totalDivisible);
    }
}