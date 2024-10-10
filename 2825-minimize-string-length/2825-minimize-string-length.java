class Solution {
    public int minimizedStringLength(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        return map.size();
    }
}