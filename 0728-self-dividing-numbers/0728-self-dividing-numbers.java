class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
           if (isTrue(i)){
               numbers.add(i);
           }
        }
        return numbers;
    }
    static boolean isTrue (int n) {
        boolean status = true;
        int divider = 0;
        int number = n;
        while (number > 0) {
            divider = number % 10;
            if (divider == 0) {
                return false;
            }
            if (n % divider != 0) {
                return false;
            }
           number /= 10;
        }
        return status;
    }
}