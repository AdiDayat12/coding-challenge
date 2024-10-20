class Solution {
    public int[] shortestToChar(String s, char c) {
      int totalC = 0;
        for (char x : s.toCharArray()) {
            if (x == c) {
                totalC++;
            }
        }
        int [] indexes = new int[totalC];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                indexes[j++] = i;
            }
        }

        int [] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int min = s.length();
            for (int k = 0; k < indexes.length; k++) {
                int value = Math.abs(indexes[k] - i);
                if (value < min) {
                    min = value;
                }
            }
            result[i] = min;
        }
        return result;  
    }
}