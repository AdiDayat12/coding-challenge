class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int [] ghostsLen = new int [ghosts.length];
        int pacManLen = Math.abs(target[0]) + Math.abs(target[1]);

        for (int i = 0; i < ghostsLen.length; i++) {
            ghostsLen[i] = Math.abs(ghosts[i][0] - target[0]) + Math.abs(ghosts[i][1] - target[1]);
        }
        boolean result = true;
        for (int n : ghostsLen) {
            if (n <= pacManLen) {
                return false;
            }
        }
        return result;
    }
}