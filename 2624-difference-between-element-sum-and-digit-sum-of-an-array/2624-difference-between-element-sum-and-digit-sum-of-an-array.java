class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sumDigit = 0;
        for (int n : nums) {
            sum += n;
            sumDigit += n;
            if (n > 9) {
                sumDigit -= n;
                while (n > 0) {
                    int mod = n % 10;
                    sumDigit += mod;
                    n /= 10;
                }
            }
        }
        return Math.abs(sumDigit - sum);
    }
}