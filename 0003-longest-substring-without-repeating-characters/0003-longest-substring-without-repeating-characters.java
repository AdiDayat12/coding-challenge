class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> seen = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}