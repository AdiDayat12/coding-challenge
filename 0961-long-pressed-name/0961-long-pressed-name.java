class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char [] nameChar = name.toCharArray();
        char [] typedChar = typed.toCharArray();

        int left = 0;
        int right = 0;

        while (right < typedChar.length) {
            if (left < nameChar.length &&  nameChar[left] == typedChar[right]){
                left++;
                right++;
            } else if (right > 0 && typedChar[right] == typedChar[right - 1]) {
                right++;
            } else {
                return false;
            }
        }
        return left == nameChar.length;
    }
}