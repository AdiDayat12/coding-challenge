class Solution {
    public int hammingWeight(int n) {
     String bin = Integer.toBinaryString(n);
        int result = 0;
        for (char c : bin.toCharArray()){
            result += (c - '0');
        }
        return result;   
    }
}