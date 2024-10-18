class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int multiple = 1;
        while (n > 0) {
            int k = n % 10;
            sum += k;
            multiple *= k;
            n /= 10;
        }
        return multiple - sum;
    }
}