class Solution {
    public static int firstMissingPositive(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            if (num > 0) {
                numbers.add(num);
            }
        }

        if (numbers.isEmpty()) {
            return 1;
        }

        Collections.sort(numbers);

 
        if (numbers.get(0) > 1) {
            return 1;
        }

    
        return result(numbers);
    }

    public static int result(List<Integer> sortedList) {
        for (int i = 0; i < sortedList.size() - 1; i++) {
            if ((sortedList.get(i + 1) - sortedList.get(i)) > 1) {
                return sortedList.get(i) + 1;
            }
        }


        return sortedList.get(sortedList.size() - 1) + 1;
    }
}