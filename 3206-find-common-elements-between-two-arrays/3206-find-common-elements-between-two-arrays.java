class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
      int idx1 = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int k : nums2) {
                if (nums1[i] == k) {
                    idx1++;
                    break;
                }
            }
        }
        int idx2 = 0;
        for (int i = 0; i < nums2.length; i++) {
            for (int y : nums1){
                if (nums2[i] == y){
                    idx2++;
                    break;
                }
            }
        }

        return new int[]{idx1, idx2};  
    }
}