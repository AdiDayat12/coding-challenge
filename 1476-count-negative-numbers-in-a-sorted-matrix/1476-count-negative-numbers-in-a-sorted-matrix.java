class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] matrix : grid) {
            for (int e : matrix) {
                if (e < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}