class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> frequency = new HashMap<>();
        for (int n : arr) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        Set<Integer> set = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (!set.add(entry.getValue())){
                return false;
            }
        }
        return true; 
    }
}