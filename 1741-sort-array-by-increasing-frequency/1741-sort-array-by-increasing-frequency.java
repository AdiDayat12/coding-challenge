class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> values = new ArrayList<>(freq.keySet());

        Comparator<Integer> customComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int freqCompare = freq.get(o1).compareTo(freq.get(o2));
                if (freqCompare != 0) {
                    return freqCompare;
                } else {
                    return o2.compareTo(o1);
                }
            }
        };
        values.sort(customComparator);

        int[] result = new int[nums.length];
        int index = 0;

        for (int val : values) {
            int count = freq.get(val);
            for (int i = 0; i < count; i++) {
                result[index++] = val;
            }
        }

        return result;
    }
}