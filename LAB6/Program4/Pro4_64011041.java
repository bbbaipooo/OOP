package Program4;

import java.util.Scanner;

public class Pro4_64011041 {
    public static void main(String[] args) {
        System.out.println("Filing Status");
        System.out.println("\t[0]-Single filer");
        System.out.println("\t[1]-Married jointly or qualifying widow(er)");
        System.out.println("\t[2]-Married seperatly");
        System.out.println("\t[3]-Head of household");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filing status : ");
        int s = input.nextInt();
        System.out.print("Enter the taxable income : ");
        int income = input.nextInt();

        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = {
            { 8350, 33950, 82250, 171550, 372950 },   // Single filer
            { 16700, 67900, 137050, 20885, 372950 },  // Married jointly or qualifying widow(er)
            { 8350, 33950, 68525, 104425, 186475 },   // Married separately
            { 11950, 45500, 117450, 190200, 372950 }  // Head of household
        };

        double tax= brackets[s][0] * rates[0] +
        (brackets[s][1] - brackets[s][0]) * rates[1] +
        (brackets[s][2] - brackets[s][1]) * rates[2] +
        (brackets[s][3] - brackets[s][2]) * rates[3] +
        (brackets[s][4] - brackets[s][3]) * rates[4] +
        (income - brackets[0][4]) * rates[5];

        System.out.println("Tax is " + tax);
    }
}
