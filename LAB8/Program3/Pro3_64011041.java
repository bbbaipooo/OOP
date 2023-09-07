package Program3;

import java.util.Scanner;

public class Pro3_64011041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double /* side, */width,height;

        /* System.out.print("Enter side : ");
        side = input.nextInt();
        while (side <= 0) {
            System.out.print("ERROR::Sides shoule be positive.\nPlease enter side again :");
            side = input.nextInt();
        } */

        System.out.print("Enter is the triangle Filled? : ");
        Boolean filled = input.nextBoolean();
        String color;
        if (filled) {
            System.out.print("Enter color: ");
            color = input.next();
        } else
        {
            color = null;
        }

        System.out.print("Enter width: ");
        width=input.nextDouble();
        System.out.print("Enter height: ");
        height=input.nextDouble();

        Rectangle rectangle1 = new Rectangle(width,height,color, filled);

        System.out.println("Area of rectangle1 is " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle1 is " + rectangle1.getPerimeter());
        System.out.println("Color of rectangle1 is " + rectangle1.getColor());
        System.out.println("Is rectangle1 filled? : " + rectangle1.isFilled());

        ////////////////
        System.out.println("");
        ///////////////

        /* System.out.print("Enter side : ");
        side = input.nextInt();
        while (side <= 0) {
            System.out.print("ERROR::Sides shoule be positive.\nPlease enter side again :");
            side = input.nextInt();
        } */

        System.out.print("Enter is the triangle Filled? : ");
        filled = input.nextBoolean();
        if (filled) {
            System.out.print("Enter color: ");
            color = input.next();
        } else
        {
            color = null;
        }

        System.out.print("Enter width: ");
        width=input.nextDouble();
        System.out.print("Enter height: ");
        height=input.nextDouble();

        Rectangle rectangle2 = new Rectangle(width,height,color, filled);

        System.out.println("Area of rectangle2 is " + rectangle2.getArea());
        System.out.println("Perimeter of rectangle2 is " + rectangle2.getPerimeter());
        System.out.println("Color of rectangle2 is " + rectangle2.getColor());
        System.out.println("Is rectangle2 filled? : " + rectangle2.isFilled());

        if(rectangle2.compareTo(rectangle1)==1){
            System.out.println("");
            System.out.println("Two Rectangle objects same areas");
        }
        else{
            System.out.println("");
            System.out.println("Two Rectangle objects not same areas");
        }
    }
}
