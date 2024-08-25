class Solution {
    public static String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            stringBuilder.append(reverse(arr[i])).append(" ");
        }
        stringBuilder.append(reverse(arr[arr.length - 1]));
        return stringBuilder.toString();
    }
    static String reverse (String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = s.length() - 1;
        for (int i = 0; i < s.length() ; i++) {
            stringBuilder.append(s.charAt(len));
            len--;
        }
        return stringBuilder.toString();
    }
}