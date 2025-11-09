class Solution {
    public int countOperations(int num1, int num2) {
        int sum = 0;
        int mod = 1;
        while (mod != 0) {
            if (num1 == 0 || num2 == 0){
                return 0;
            }
            if (num1 == num2) {
                return 1;
            }

            if (num1 == 1) {
                return sum + num2;
            }
            if (num2 == 1) {
                return sum + num1;
            }

            if (num1 > num2) {
                sum += num1 / num2;
                num1 = num1 % num2;
                mod = num1;
            } else {
                sum += num2 / num1;
                num2 = num2 % num1;
                mod = num2;
            }

        }
        return sum;
    }
}