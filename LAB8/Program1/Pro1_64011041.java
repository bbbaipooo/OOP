package Program1;

import java.util.Scanner;

public class Pro1_64011041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side;

        System.out.print("Enter side : ");
        side = input.nextInt();
        while (side <= 0) {
            System.out.print("ERROR::Sides shoule be positive.\nPlease enter side again :");
            side = input.nextInt();
        }

        System.out.print("Enter is the triangle Filled? : ");
        Boolean filled = input.nextBoolean();
        String color;
        if (filled) {
            System.out.print("Enter color: ");
            color = input.next();
        } else
            color = null;

        Triangle triangle = new Triangle(color, filled, side);

        System.out.println("Area of triangle is " + triangle.getArea());
        System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
        System.out.println("Color of triangle is " + triangle.getColor());
        System.out.println("Is triangle filled? : " + triangle.isFilled());
    }
}