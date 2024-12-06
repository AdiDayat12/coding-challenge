class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
       Set<Integer> banneds = new HashSet<>();
        for (int i : banned) {
            if (i <= n){
                banneds.add(i);
            }
        }

        int sum = 0;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            if (banneds.contains(i)) {
                continue;
            }

            if (sum + i <= maxSum) { 
                total++;
                sum += i;
            } else {
                break; 
            }
        }
        return total;
    }
}