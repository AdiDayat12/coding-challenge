class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       Map<Integer, String> person = new HashMap<>();
        LinkedHashMap<Integer, String > result = new LinkedHashMap<>();
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            person.put(heights[i], names[i]);
        }

        for (Map.Entry<Integer, String> entry : person.entrySet()){
            values.add(entry.getKey());
        }

        values.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int val : values){
            for (Map.Entry<Integer, String> entry : person.entrySet()){
                if (entry.getKey() == val){
                    result.put(val, entry.getValue());
                }
            }
        }
        List<String> array = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : result.entrySet()){
            array.add(entry.getValue());
        }
        String [] newString = new String[names.length];
        for (int i = 0; i < newString.length; i++) {
            newString[i] = array.get(i);
        }
        return newString;
    }
}