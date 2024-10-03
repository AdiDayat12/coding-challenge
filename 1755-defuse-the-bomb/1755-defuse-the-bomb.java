class Solution {
    public int[] decrypt(int[] code, int k) {
        int [] arr = new int[code.length];

        if (k == 0) {
            Arrays.fill(arr, 0);
        } else if (k > 0) {
            for (int i = 0; i < arr.length; i++) {
                int total = 0;
                for (int j = 0; j < k; j++) {
                    total += code[(i + 1 + j) % code.length];
                }
                arr[i] = total;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                int total = 0;
                for (int j = 0; j < k * - 1; j++) {
                    total += code[(i - 1 - j + code.length) % code.length];
                }
                arr[i] = total;
            }
        }
        return arr;
    }
}