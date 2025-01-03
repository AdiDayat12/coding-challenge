class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for (int n : nums){
            sum += n;
        }

        int len = nums.length;

        if (len <= 1){
            return 0;
        }

        int total = 0;
        long currentValue = 0;
        long gap = 0;
        for (int i = 0; i < len - 1; i++){
            currentValue += nums[i];
            gap = sum - currentValue;
            if (currentValue >= gap){
                total++;
            }
        }

        return total;
    }
}