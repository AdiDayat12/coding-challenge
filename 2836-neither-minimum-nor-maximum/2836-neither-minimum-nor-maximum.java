class Solution {
   public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }

        int min = nums[0];
        int max = nums[0];

        for (int x : nums) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }


        int value = -1;
        for (int y : nums) {
            if (y != min && y != max) {
                value = y;
            }
        }
        return  value;
    }
}