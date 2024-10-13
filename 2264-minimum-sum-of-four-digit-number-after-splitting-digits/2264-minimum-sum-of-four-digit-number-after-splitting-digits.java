class Solution {
    public int minimumSum(int num) {
        int min1 = 9;
        int min2 = 9;
        int max1 = 0;
        int max2 = 0;

        while (num > 0) {
            int n = num % 10;
            if (n < min1 || n == min1){
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
            if (n > max1  || n == max1){
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }
            num /= 10;
        }

        return (min1 * 10 + max1) + (min2 * 10 + max2); 
    }
}