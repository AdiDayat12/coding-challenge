class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Integer> freqValues = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            freqValues.add(entry.getValue());
        }
        freqValues.sort(Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (Integer value : freqValues) {
            for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
                if (entry.getValue().equals(value)) {

                    result.append(String.valueOf(entry.getKey()).repeat(Math.max(0, value)));
                    freq.remove(entry.getKey());
                    break; 
                }
            }
        }
        return result.toString();
    }
}