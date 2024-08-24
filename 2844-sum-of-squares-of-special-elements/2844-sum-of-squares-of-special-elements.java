class Solution {
    public int sumOfSquares(int[] nums) {
        int len = nums.length;
        List<Integer> special = new ArrayList<>();
        for (int i = 1; i <= len; i++) {
            if (len % i == 0) {
                special.add(nums[i - 1]);
            }
        }
        System.out.println(special);
        int result = 0;
        for (int s : special) {
            result += s * s;
        }
        return result;
    }
}