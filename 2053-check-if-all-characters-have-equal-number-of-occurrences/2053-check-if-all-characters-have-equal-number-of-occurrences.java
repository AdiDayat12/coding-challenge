class Solution {
    public boolean areOccurrencesEqual(String s) {
       Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int firstKey = freq.get(s.charAt(0));
        for (Map.Entry<Character, Integer> entry : freq.entrySet()){
            if (entry.getValue() != firstKey) {
                return false;
            }
        }
        return true; 
    }
}