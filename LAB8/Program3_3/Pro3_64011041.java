package Program3_3;

import java.util.Scanner;

public class Pro3_64011041 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        double width,height;

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

        Rectangle rectangle = new Rectangle(width,height,color, filled);

        System.out.println("Area of rectangle1 is " + rectangle.getArea());
        System.out.println("Perimeter of rectangle1 is " + rectangle.getPerimeter());
        System.out.println("Color of rectangle1 is " + rectangle.getColor());
        System.out.println("Is rectangle1 filled? : " + rectangle.isFilled());

        ////////////////
        System.out.println("");
        ///////////////

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

        ComparableRectangle comparableRectangle = new ComparableRectangle(width,height,color, filled);

        System.out.println("Area of rectangle2 is " + comparableRectangle.getArea());
        System.out.println("Perimeter of rectangle2 is " + comparableRectangle.getPerimeter());
        System.out.println("Color of rectangle2 is " + comparableRectangle.getColor());
        System.out.println("Is rectangle2 filled? : " + comparableRectangle.isFilled());

        if(rectangle.compareTo(comparableRectangle)==1){
            System.out.println("");
            System.out.println("Two Rectangle objects same areas");
        }
        else{
            System.out.println("");
            System.out.println("Two Rectangle objects not same areas");
        }
    }
}
