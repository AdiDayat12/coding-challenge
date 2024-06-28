class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums1){
            for (int n : nums2){
                if (num == n){
                    seen.add(num);
                }
            }
        }
        return seen.stream().mapToInt(Integer::intValue).toArray();
    }
}