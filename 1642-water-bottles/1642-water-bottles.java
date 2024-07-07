class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles < numExchange){
            return numBottles;
        }
        int a = numBottles;
        int b = 0;
        int c = 0;
        while ((numBottles / numExchange) > 0){
            b = numBottles % numExchange;
            c = numBottles / numExchange;
            a = a + c;
            numBottles = numBottles / numExchange + b;
        }
        return a;
    }
}