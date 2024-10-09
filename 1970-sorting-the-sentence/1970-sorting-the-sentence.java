class Solution {
    public String sortSentence(String s) {
        String [] arrString = s.split(" ");

        Map<Integer, String> map = new TreeMap<>();
        for (String string : arrString) {
            int len = string.length();
            int num = Integer.parseInt(string.substring(len - 1));
            map.put(num, string);
        }

        StringBuilder stringBuilder = new StringBuilder();

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            int len = entry.getValue().length() - 1;
            stringBuilder.append(entry.getValue(), 0, len);
            if (iterator.hasNext()) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }
}