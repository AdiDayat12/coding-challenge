class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups){
        if (words.length == 1){
            return List.of(words[0]);
        }
        List<String> arr = new ArrayList<>();
        int currentValue = groups[0];
        arr.add(words[0]);
        for (int i = 1; i < groups.length; i++){
            if (currentValue != groups[i]){
                arr.add(words[i]);
                currentValue = groups[i];
            }
        } 
        return arr;     
    }
}