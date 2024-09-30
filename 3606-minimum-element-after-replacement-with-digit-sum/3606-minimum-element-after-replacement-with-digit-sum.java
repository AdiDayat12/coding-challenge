class Solution {
    public static int minElement(int[] nums) {
        if (nums.length == 1) {
            return sum(nums[0]);
        }

        int min = nums[0];

        for (int n : nums) {
           n = sum(n);
           if (n < min) {
            min = n;
           }
        }
        return min;
    }

    static int sum (int n) {
        if (n < 10) {
            return n;
        }
        int total = 0;
        int x = 0;
        while (n > 0) {
            x = n % 10;
            total += x;
            n /= 10;
        }
        return total;
    }
}