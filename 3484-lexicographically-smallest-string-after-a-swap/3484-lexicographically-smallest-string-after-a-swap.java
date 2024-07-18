class Solution {
    public String getSmallestString(String s) {
       char [] value = s.toCharArray();
        for (int i = 0; i < value.length - 1; i++) {
            if (value[i] > value[i + 1] && (value[i] % 2 ==0 && value[i+1] % 2 == 0 ||value[i] % 2 != 0 && value[i+1] % 2 != 0 )){
                char temp = value[i];
                value[i] = value[i+1];
                value[i+1] = temp;
                break;
            }
        }
        return new String(value); 
    }
}