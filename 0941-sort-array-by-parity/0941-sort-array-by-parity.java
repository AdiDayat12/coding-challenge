class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] sortedByParity = new int [nums.length];
        int len = nums.length - 1;
        int idx = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                sortedByParity[idx] = n;
                idx++;
            } else {
                sortedByParity[len] = n;
                len--;
            }
            
        }
        return sortedByParity;
    } 
}