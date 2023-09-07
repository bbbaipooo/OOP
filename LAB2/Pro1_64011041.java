import java.util.Scanner;

public class Pro1_64011041 {
    public static void main(String[] args) {
        String[] day = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int currentDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int numOfDay = input.nextInt();

        int futureDay = (currentDay + numOfDay)%7;
        /* if (numOfDay > 7) {
            numOfDay = numOfDay % 7;
        }
        int futureDay = currentDay + numOfDay; */

        System.out.printf("Today is %s and the future day is %s",day[currentDay],day[futureDay]);

    }
}