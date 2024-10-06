class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums){
            freq.put(n, freq.getOrDefault(n,0) + 1);
        }

        int [] res = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            
            if (entry.getValue() == 2) {
                res[i] = entry.getKey();
                i++;
            }
        }
        return res;

    }
}