class Solution {
    public boolean repeatedSubstringPattern(String s) {
         int len = s.length();

        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0){
                String sub = s.substring(0, i);
                int repeatCount = len / i;
                StringBuilder newString = new StringBuilder();

                newString.append(sub.repeat(repeatCount));
                if (newString.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}