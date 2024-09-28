class Solution {
    public String freqAlphabets(String s) {
        String[] arr = new String[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = String.valueOf((char) ('a' + i));
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) == '#') {
                int index = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                stringBuilder.append(arr[index - 1]);
                i -= 2;
            } else {
                int index = s.charAt(i) - '0';
                stringBuilder.append(arr[index - 1]);
            }
        }
        return stringBuilder.reverse().toString(); 
    }
}