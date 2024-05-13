class Solution {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int x : row){
            for (int i = 0; i < matrix[x].length; i++) {
                matrix[x][i] = 0;
            }
        }
        for (int x : col){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][x] = 0;
            }
        }
}
}
