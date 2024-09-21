class Solution {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] arrMorse = new String [words.length];

        for (int i = 0; i < arrMorse.length; i++) {
            arrMorse[i] = convertToString(words[i]);
        }
        Set<String> stringSet = new HashSet<>();
        for (String s : arrMorse){
            stringSet.add(s);
        }
        return stringSet.size();

    }

    static String convertToString (String s) {
        String [] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
                "-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - (int) 'a';
            result.append(morse[value]);
        }
        return result.toString();
    }
}