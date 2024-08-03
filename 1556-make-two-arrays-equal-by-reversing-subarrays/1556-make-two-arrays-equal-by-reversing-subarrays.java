class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> freqTarget = new HashMap<>();
        HashMap<Integer, Integer> freqArr = new HashMap<>();

        for (int i : target){
            freqTarget.put(i, freqTarget.getOrDefault(i, 0 ) + 1);
        }
        for (int i : arr){
            freqArr.put(i, freqArr.getOrDefault(i, 0 ) + 1);
        }

        if (freqArr.size() != freqTarget.size()){
            return false;
        }

        for (Map.Entry<Integer, Integer> entry : freqTarget.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if (!freqArr.containsKey(key) || freqArr.get(key) != value ){
                return false;
            }
        }
        return true;
    }
}