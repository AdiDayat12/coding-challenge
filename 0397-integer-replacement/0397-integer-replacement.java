class Solution {
    public int integerReplacement(int n) {
        long k = n;
       int count = 0;
        while (k > 1) {
            if (k == 3) {
                k--;
                count++;
            }
            if (k % 2 == 0) {
                k /= 2;
            } else {
                if ((k + 1) % 4 == 0) {
                    k++;
                } else if ((k - 1) % 4 == 0) {
                    k--;
                }
            }
            count++;
        }
        return count;
    }
}