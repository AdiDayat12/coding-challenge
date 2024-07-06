class Solution {
    public int passThePillow(int n, int time) {
        int result = 0;
        if (time < n){
            return time + 1;
        }
        int steps = n - 1;
        int mod = time % steps;
        int x = time / steps;

    
        return x % 2 == 0 ? 1 + mod : n - mod;
    }
}