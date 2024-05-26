class Solution {
    public String reverseWords(String s) {
        String x = s.trim();
        String newString = x.replaceAll("\\s+", " ");
        String [] arrString = newString.split(" ");

        List<String> stringList = new ArrayList<>();
        for (int i = arrString.length - 1; i >= 0 ; i--) {
            stringList.add(arrString[i]);
        }
        return String.join(" ", stringList);
    }
}