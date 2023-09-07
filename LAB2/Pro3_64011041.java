import java.util.Scanner;

public class Pro3_64011041 {
    public static void main(String[] args) {
        String[] dayOfWeek = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();
        System.out.print("Enter a day of the month: 1-31: ");
        int q = input.nextInt();

        int j = year / 100;
        int k = year % 100;
        if (m == 1) {
            m = 13;
        } else if (m == 2) {
            m = 14;
        }

        int h = (q + 26 * (m + 1) / 10 + k / 4 + j / 4 + 5 * j) % 7;

        System.out.printf("The Name of the day of the week is %s", dayOfWeek[h]);

    }
}
