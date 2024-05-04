class Solution {
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        int start = 0;
        int end = string.length() -1;
        while (start < end){
            if (string.charAt(start) != string.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}