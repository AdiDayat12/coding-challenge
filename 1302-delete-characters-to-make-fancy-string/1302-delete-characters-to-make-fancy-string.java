class Solution {
    public String makeFancyString(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == builder.charAt(builder.length() - 1)){
                count++;
                if (count < 3){
                    builder.append(s.charAt(i));
                }
            } else {
                count = 1;
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}