class Solution {
    public int maxFrequencyElements(int[] nums) {
     Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        int max = 0;
        List<Integer> values = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            max = Math.max(max, entry.getValue());
            values.add(entry.getValue());
        }
        int count = 0;
        for (int n : values) {
            if (n == max){
                count++;
            }
        }
        return max * count;
    }
}