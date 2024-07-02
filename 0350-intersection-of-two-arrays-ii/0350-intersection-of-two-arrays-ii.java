class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int n1 : nums1){
            map1.put(n1, map1.getOrDefault(n1, 0) + 1);
        }
        for (int n2 : nums2){
            map2.put(n2, map2.getOrDefault(n2, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int key : map1.keySet()){
            if (map2.containsKey(key)){
                int minFre = Math.min(map1.get(key), map2.get(key));

                for (int i = 0; i < minFre; i++) {
                    result.add(key);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}