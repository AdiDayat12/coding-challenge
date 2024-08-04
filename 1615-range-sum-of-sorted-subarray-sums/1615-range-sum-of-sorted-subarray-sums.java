class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> newArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newArr.add((long) nums[i]);
            int num = nums[i];
            for (int j = i + 1; j < n; j++) {
                num = num + nums[j];
                newArr.add((long) num);
            }
        }
        Collections.sort(newArr);
        int MOD = 1000000007;
        long result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + newArr.get(i)) % MOD;
        }
        return (int) result;
    }
}