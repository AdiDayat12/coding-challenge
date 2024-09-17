class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String [] arr1 = s1.split(" ");
        String [] arr2 = s2.split(" ");
        Map<String, Integer> freq = new HashMap<>();

        for (String s : arr1) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        for (String s : arr2) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        List<String> one = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                one.add(entry.getKey());
            }
        }
        return one.toArray(new String[0]);
    }
}