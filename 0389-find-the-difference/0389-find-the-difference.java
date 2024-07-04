class Solution {
    public char findTheDifference(String s, String t) {
        if (s.isEmpty()){
            return t.charAt(0);
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        char diff = 0;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                diff = entry.getKey();
            }
        }

        return diff;
    }
}