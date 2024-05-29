class Solution {
    public int divide(int dividend, int divisor) {
       if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Handle the special case of dividend being zero
        if (dividend == 0) {
            return 0;
        }

        // Handle edge case of potential overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // This would cause overflow
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert dividend and divisor to positive values (use long to handle overflow)
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        // Perform division using bitwise shifts
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            long multiple = 1;

            // Double the divisor and multiple until it is less than or equal to dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest shifted divisor from the dividend
            absDividend -= tempDivisor;
            result += multiple;
        }

        // Apply the sign to the result
        return isNegative ? -result : result;
    }
}