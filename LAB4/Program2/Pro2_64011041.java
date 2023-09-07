package Program2;

import java.security.GeneralSecurityException;
import java.util.GregorianCalendar;
import java.util.Calendar;

class Pro2_64011041{
    public static void main(String[] args) {
        GregorianCalendar gcal=new GregorianCalendar();

        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is "+gcal.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+gcal.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+gcal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+gcal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");

        //gcal.setTimeInMillis(1643700000000L);
        gcal.add(Calendar.DATE, 1);

        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is "+gcal.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+gcal.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+gcal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+gcal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(gcal.getTime());
    }
}