import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        Collection<Integer> values = freq.values();
        int max = 0;
        int times = 1;
        for (int v : values) {
            if (v > max) {
                max = v;
                times = 1;
            } else if (v == max) {
                times++;
            }
        }
        return max * times;
    }
}