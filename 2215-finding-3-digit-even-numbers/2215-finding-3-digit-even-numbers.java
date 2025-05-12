class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k){
                            int number = (digits[i] * 10 + digits[j]) * 10 + digits[k];
                            if ((number & 1) == 0 && number >= 100){
                                numbers.add(number);
                            }
                }
            }
        }
    }
        int [] evenNumbers = new int[numbers.size()];
        int i = 0;
        for (Integer num : numbers){
            evenNumbers[i++] = num;
        }
        return evenNumbers;
    }
}