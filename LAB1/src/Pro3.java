import java.util.Scanner;

public class Pro3_64011041 {
    public static void main(String[] args) {
        int i,j=0;
        System.out.print("Enter a number between 0 and 1000 : ");
        Scanner input = new Scanner(System.in);
        i=input.nextInt();
        for(int k=0;k<4;k++)
        {
            j+=(i%10);
            i=i/10;
        }
        System.out.printf("The sum of the digits is %d",j);
    }
}
