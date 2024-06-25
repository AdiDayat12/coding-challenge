class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<Integer> indeces = new ArrayList<>();
        List<String> word = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])){
                    indeces.add(i+j);
                    word.add(list2[j]);
                }
            }
        }
        int min = Collections.min(indeces);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < indeces.size(); i++) {
            if (indeces.get(i) == min) {
                result.add(word.get(i));
            }
        }
        return result.toArray(new String[result.size()]);
    }
}