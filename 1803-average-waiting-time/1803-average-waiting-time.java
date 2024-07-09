class Solution {
    public double averageWaitingTime(int[][] customers) {
        int res = 0;
        double total = 0;
        for (int[] customer : customers) {
            if (res < customer[0]) {
                res = customer[0];
            }
            res = res + customer[1];
            int div = res - customer[0];
            total += div;
        }
        double waitTime = (double) total / customers.length;
        return Double.parseDouble(String.format("%.5f", waitTime));
    }
}