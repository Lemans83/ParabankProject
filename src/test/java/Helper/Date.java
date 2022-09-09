package Helper;

import java.text.SimpleDateFormat;

public class Date {

    public static int verifyDisabledDates(){
        java.util.Date currDate = new java.util.Date();
        SimpleDateFormat myOnlyformat = new SimpleDateFormat("d");
        return Integer.valueOf(myOnlyformat.format(currDate));
    }

    public static String getCurrentDate() {
        java.util.Date currDate = new java.util.Date();
        SimpleDateFormat onlyDate = new SimpleDateFormat("MM/dd/yyyy");
        String today = onlyDate.format(currDate);
        return today;
    }







}
