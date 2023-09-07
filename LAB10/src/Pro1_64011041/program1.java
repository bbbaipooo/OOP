package Pro1_64011041;

import java.util.Scanner;

public class program1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = new int[100]; //0-99
        
        int index = scanner.nextInt(); //variablr for kept user input!

        try {
            for (int i = 0; i < 100; i++) {
                int randNum = (int)(Math.random() * 1000000000);
                nums[i] = randNum;
            }
            System.out.println("element of" +" "+index +" "+ "is" +" "+ nums[index] );

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }
}