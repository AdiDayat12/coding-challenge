class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i : nums){
            if (!seen.add(i)){
                seen.remove(i);
            }
        }
        Object[] a = seen.toArray();
        return (int) a[0];
    }
}