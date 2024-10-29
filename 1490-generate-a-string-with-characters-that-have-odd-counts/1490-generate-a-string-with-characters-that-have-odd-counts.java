class Solution {
    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        if ((n&1) != 1) {
            s.append("a".repeat(Math.max(0, n - 1)));
            s.append("b");
        } else {
            s.append("a".repeat(n));
        }
        return s.toString();
    }
}