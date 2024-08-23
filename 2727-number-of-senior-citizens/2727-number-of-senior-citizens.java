class Solution {
    public int countSeniors(String[] details) {
       int count = 0;
        for (String s : details) {
            if (Integer.parseInt(s.substring(11, 13)) > 60){
                count++;
            }
        }
        return count; 
    }
}