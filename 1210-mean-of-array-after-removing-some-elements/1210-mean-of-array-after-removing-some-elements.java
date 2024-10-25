class Solution {
    public double trimMean(int[] arr) {
        int indexToRemove = (int) (0.05 * arr.length);

        Arrays.sort(arr);

        int result = 0;
        int divisor = 0;
        for (int i = indexToRemove; i < arr.length - indexToRemove; i++){
            result += arr[i];
            divisor++;
        }
        return (double) result / divisor;
        
    }
}