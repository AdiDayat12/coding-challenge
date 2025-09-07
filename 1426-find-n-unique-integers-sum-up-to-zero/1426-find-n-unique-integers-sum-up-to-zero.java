class Solution {
    public int[] sumZero(int n) {
        int halfLen = n / 2;
        int x = - halfLen;
        int arr [] = new int [n];
        
        for (int i = 0; i < n; i++){
            arr[i] = x;
            x++;
            if (x == 0) {
                x++;
            }
        }

        if (n % 2 != 0) {
            arr[n-1] = 0;
        }

        return arr;
    }
}