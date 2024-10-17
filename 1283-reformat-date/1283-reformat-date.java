class Solution {
    public String reformatDate(String date) {
      StringBuilder s = new StringBuilder();
        String [] arrDate = date.split(" ");
        String year = arrDate[2];
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        String month = months.get(arrDate[1]);

        String dateNumber = arrDate[0].length() == 4 ? arrDate[0].substring(0, 2) :
                "0" + arrDate[0].charAt(0);


        s.append(year).append("-").append(month).append("-").append(dateNumber);
        return s.toString();  
    }
}