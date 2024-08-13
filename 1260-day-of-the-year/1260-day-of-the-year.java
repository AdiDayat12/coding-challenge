class Solution {
    public int dayOfYear(String date) {
       String [] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        int [] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;
        for (int i = 0; i < month; i++) {
            total+= months[i];
        }
        total += day;

        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (leap && month > 2){
            return total + 1;
        }
        return total;
    }
}