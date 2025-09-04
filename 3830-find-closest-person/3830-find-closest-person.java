class Solution {
    public int findClosest(int x, int y, int z) {
        int xToZ = Math.abs (z - x);
        int yToZ = Math.abs (z - y);

        if (xToZ < yToZ) {
            return 1;
        } else if (yToZ < xToZ) {
            return 2;
        } else {
            return 0;
        }
    }
}