import java.util.Scanner;

public class Pro4_64011041 {
    public static void main(String[] args) {
        double heightInches, weightPounds, weightKilograms, heightMeters,BMI;
        System.out.print("Enter weitght in pounds : ");
        Scanner inputWeight = new Scanner(System.in);
        weightPounds = inputWeight.nextDouble();
        System.out.print("Enter height in inches : ");
        Scanner inputHeight = new Scanner(System.in);
        heightInches = inputHeight.nextDouble();
        weightKilograms = weightPounds * 0.45359237;
        heightMeters = heightInches * 0.0254;
        BMI=weightKilograms/Math.pow(heightMeters,2);
        System.out.printf("BMI is %.4f",BMI);
    }
}
