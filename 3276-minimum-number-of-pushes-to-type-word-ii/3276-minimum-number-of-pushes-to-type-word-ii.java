class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : word.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(freq.entrySet());

        list.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });

        HashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int totalPushes = 0;
        int[] keyPresses = new int[8];
        int keyIndex = 0;

        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            int frequency = entry.getValue();
            totalPushes += (keyPresses[keyIndex] + 1) * frequency;
            keyPresses[keyIndex]++;
            keyIndex = (keyIndex + 1) % 8;
        }
        return totalPushes;
    }
}