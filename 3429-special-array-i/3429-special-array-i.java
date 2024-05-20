class Solution {
    public static boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean result = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] % 2 == 0) && (nums[i + 1] % 2 != 0) || (nums[i] % 2 != 0) && (nums[i + 1] % 2 == 0)) {
                result =  true; 
            }else{
                return false;
            }
        }
        return result;
    }

}