class Solution {
    public String getEncryptedString(String s, int k) {
        char [] arr = s.toCharArray();
        char [] newString = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int sum = i + k;
            if (sum >= s.length()){
                sum %= s.length();
            }
            newString[i] = arr[sum];
        }
        return new String(newString);
    }
}