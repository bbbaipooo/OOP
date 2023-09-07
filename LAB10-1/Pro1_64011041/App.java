package Pro1_64011041;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Enter Number");
        Scanner input = new Scanner(System.in);
        System.out.print("\n");

        int[] nums = new int[100];
        int index = input.nextInt();

        try {
            for (int i = 0; i < 100; i++) {
                int randNum = (int)(Math.random() * 10000);
                nums[i] = randNum;
            }
            System.out.println("element of "+index +" is "+ nums[index] );

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }
}
