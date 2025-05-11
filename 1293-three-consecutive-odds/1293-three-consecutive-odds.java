class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddCount = 0;
        for (int n : arr){
            if ((n & 1) == 1){
                oddCount++;
            } else{
                oddCount = 0;
            }
            if (oddCount == 3){
                return true;
            }
        }
        return false;
    }
}