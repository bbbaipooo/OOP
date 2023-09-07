package Program1;

import java.util.Scanner;

public class Pro1_64011041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("Enter your weight in pounds : ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches\tfeet : ");
        double feet = input.nextDouble();
        System.out.print("\t\t\t\tinches : ");
        double inches = input.nextDouble();

        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.println("Your BMI is "+bmi.getBMI());
        System.out.print("Your interpretation is " + bmi.getInterpretation());
    }
}