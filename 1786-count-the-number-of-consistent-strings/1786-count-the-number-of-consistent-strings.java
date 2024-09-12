class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        for (String word : words) {
            String [] arr = word.split("");
            for (String s2 : arr) {
                if (!allowed.contains(s2)){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}