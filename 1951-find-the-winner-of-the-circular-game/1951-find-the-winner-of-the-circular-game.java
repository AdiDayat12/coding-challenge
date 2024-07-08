class Solution {
    public static int findTheWinner(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }
        System.out.println(nums);
        return find(nums, n, k);
    }

    public static int find (List<Integer> nums, int n, int k){
        if (nums.size() == 1 ){
            return nums.get(0);
        }
        int index = (n + k - 1) % nums.size();
        nums.remove(index);
        return find(nums, index, k);
    }
}