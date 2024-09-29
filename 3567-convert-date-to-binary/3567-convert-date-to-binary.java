class Solution {
    public String convertDateToBinary(String date) {
        String [] arr = date.split("-");

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int bin = Integer.parseInt(arr[i]);
            s.append(Integer.toBinaryString(bin));
            if (i != arr.length - 1){
                s.append("-");
            }
        }
        return s.toString(); 
    }
}