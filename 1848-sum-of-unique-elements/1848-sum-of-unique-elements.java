class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int total = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if (entry.getValue() == 1) {
                total += entry.getKey();
            }
        }
        return total;
    }
}