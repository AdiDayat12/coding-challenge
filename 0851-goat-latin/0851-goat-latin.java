class Solution {
     public static String toGoatLatin(String sentence) {
        String [] arr = sentence.split(" ");
        String [] newArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String addA = "a".repeat(i + 1);
            newArr[i] = addMa(arr[i]) + addA;
        }

        return String.join(" ", newArr);
    }

    static String addMa (String s) {
        char firstChar = s.charAt(0);
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' ||
                firstChar == 'o' || firstChar == 'u' ||
        firstChar == 'A' || firstChar == 'E' || firstChar == 'I' ||
                firstChar == 'O' || firstChar == 'U') {
            s = s + "ma";
        } else{
            s = s.substring(1) + firstChar + "ma";
        }
        return s;
    }
}