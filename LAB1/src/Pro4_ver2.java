import java.util.Scanner;

public class Pro4_2 {
    public static void main(String[] args) {
        double heightInches, weightPounds, weightKilograms, heightMeters, BMI;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds : ");
        weightPounds = input.nextDouble();
        System.out.print("Enter height in inches : ");
        heightInches = input.nextDouble();

        weightKilograms = weightPounds * 0.45359237;
        heightMeters = heightInches * 0.0254;
        BMI=weightKilograms/Math.pow(heightMeters,2);

        System.out.printf("BMI is %.4f",BMI);
    }
}

/*
 * Alt + Shift + A = comment
 * Alt + Shift + F = จัดหน้า
 */
