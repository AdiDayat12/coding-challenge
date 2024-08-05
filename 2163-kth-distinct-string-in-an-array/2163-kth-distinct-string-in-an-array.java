class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> seen = new LinkedHashMap<>();
        for (String s : arr){
            seen.put(s, seen.getOrDefault(s, 0) + 1);
        }
        List<String> texts = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : seen.entrySet()){
            String key = entry.getKey();
            if (seen.get(key) < 2){
                texts.add(key);
            }
        }
        return texts.size() < k ? "" : texts.get(k - 1);
    }
}