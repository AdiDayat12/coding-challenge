class Solution {
    public String losingPlayer(int x, int y) {
        int count = 0;
        while (x >= 1 && y >= 4){
            count++;
            x--;
            y-=4;
        }
        return count % 2 != 0 ? "Alice" : "Bob";
    }
}