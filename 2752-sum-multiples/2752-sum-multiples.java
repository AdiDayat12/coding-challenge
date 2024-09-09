class Solution {
    public int sumOfMultiples(int n) {
        int count = 0;
        while (n > 2) {
            if (n % 7 == 0 || n % 5 == 0 || n % 3 == 0) {
                count += n;
            }
            n--;
        }
        return count;
    }
}