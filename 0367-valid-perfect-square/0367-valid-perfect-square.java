class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2;
        long right = num / 2;
        long mid;
        long square;

        while (left <= right) {
            mid = left + (right - left) / 2;
            square = mid * mid;

            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}