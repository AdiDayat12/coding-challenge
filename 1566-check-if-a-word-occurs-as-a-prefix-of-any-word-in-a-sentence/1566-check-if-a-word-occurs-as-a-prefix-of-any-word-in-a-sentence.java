class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() >= searchWord.length() && strings[i].startsWith(searchWord)){
                return i + 1;
            }
        }
        return -1;
    }
}