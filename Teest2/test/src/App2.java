import java.util.*;

public class App2 {
    public static void main(String[] args) {
        GregorianCalendar c=new GregorianCalendar();

        System.out.println("Current year, month ,date, and day of week");
        System.out.println("Year is "+c.get(c.YEAR)+
        "\nMonth is "+c.get(c.MONTH)+
        "\nDate is "+c.get(c.DATE)+
        "\nDay of week is "+c.get(c.DAY_OF_WEEK)+"\n--------------");

        c.add(Calendar.DATE,1);

        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is "+c.get(c.YEAR)+
        "\nMonth is "+c.get(c.MONTH)+
        "\nDate is "+c.get(c.DATE)+
        "\nDay of week is "+c.get(c.DAY_OF_WEEK)+c.getTime());

    }
}
