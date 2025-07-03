class Solution {
    public static char kthCharacter(int k) {
        String word = "a";
        while (word.length() < k) {
            word = constructWord(word);
        }
        return word.charAt(k - 1);
    }

    private static String constructWord (String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length() ; i++) {
            char current = word.charAt(i);
            char next = '\u0000';
            if (current == 'z'){
                next = 'a';
            } else {
                next = (char) (current + 1);
            }
            stringBuilder.append(next);
        }
        return word + stringBuilder;
    }
}