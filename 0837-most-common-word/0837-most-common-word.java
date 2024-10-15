class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase()
                .replaceAll("\\p{Punct}", " ");
        for (String ban : banned) {
            ban = ban.toLowerCase();
            paragraph = paragraph.replaceAll(ban, "");
                    
        }
        Map<String, Integer> freq = new HashMap<>();

        String [] arr = paragraph.split("\\s+");
        for (String s : arr){
            if (!s.isEmpty()){
                freq.put(s, freq.getOrDefault(s, 0) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        String key = "";

        for (Map.Entry<String, Integer> entry : freq.entrySet()){
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
}