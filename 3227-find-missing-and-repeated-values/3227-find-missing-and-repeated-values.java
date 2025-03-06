class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length * grid.length;

        int total = 0;
        for (int i = 1; i <= len; i++) {
            total += i;
        }
        Set<Integer> set = new HashSet<>();

        int sum = 0;
        int sumSet = 0;


        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                sum +=  grid[i][j];
                set.add(grid[i][j]);
            }
        }

        for (int n : set){
            sumSet += n;
        }


        return new int[]{sum - sumSet, total - sumSet};
    }
}