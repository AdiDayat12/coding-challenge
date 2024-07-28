class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String balloon = "balloon";
        Map<Character, Integer> ballCount = new HashMap<>();
        for (char c : balloon.toCharArray()){
            ballCount.put(c, ballCount.getOrDefault(c, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : ballCount.entrySet()){
            char c = entry.getKey();
            int total = entry.getValue();
            int rest = map.getOrDefault(c, 0);
            min = Math.min(min, rest / total);
        }
        return min;
    }
}