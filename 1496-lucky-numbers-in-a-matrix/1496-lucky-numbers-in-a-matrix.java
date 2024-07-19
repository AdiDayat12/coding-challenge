class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> rowValue = Arrays.stream(matrix).map(row -> Arrays.stream(row).min().getAsInt())
                .toList();

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        List<Integer> columnValue = IntStream.range(0, numCols)
                .mapToObj(col -> IntStream.range(0, numRows)
                .map(row -> matrix[row][col])
                .max().getAsInt()).toList();


        return rowValue.stream().filter(columnValue::contains).collect(Collectors.toList());
    }
}