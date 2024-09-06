class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String s1 = "";
        for (String string : word1){
            s1 = s1.concat(string);
        }
        String s2 = "";
        for (String string : word2){
            s2 = s2.concat(string);
        }
        return s1.equals(s2);
    }
}