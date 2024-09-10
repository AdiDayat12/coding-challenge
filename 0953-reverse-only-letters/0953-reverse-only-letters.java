class Solution {
    public String reverseOnlyLetters(String s) {
       StringBuilder stringBuilder = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (Character.isLetter(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
            i--;
        }
        int j = 0;
        int index = 0;
        char [] chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isLetter(c)){
                chars[index] = stringBuilder.charAt(j);
                j++;
            }
            index++;

        }
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }
        return result.toString();
    }
}