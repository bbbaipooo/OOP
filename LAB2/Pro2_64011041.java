import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Pro2_64011041 {
    public static void main(String[] args) {
        String[] srp = { "scissor", "rock", "paper" };

        Random rand = new Random();
        int randNum = rand.nextInt(100);
        randNum = randNum % 2;

        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner input = new Scanner(System.in);
        int inputSRP = input.nextInt();

        if(((inputSRP==0)&&(randNum==2))||(inputSRP==1)&&(randNum==0)||((inputSRP==2)&&(randNum==1)))
        {
            System.out.printf("The computer is %s. You are %s. You won",srp[randNum],srp[inputSRP]);
        }
        else if(((inputSRP==0)&&(randNum==0))||((inputSRP==1)&&(randNum==1))||((inputSRP==2)&&(randNum==2)))
        {
            System.out.printf("The computer is %s. You are %s too. It is a draw",srp[randNum],srp[inputSRP]);
        }
        else
        {
            System.out.printf("The computer is %s. You are %s too. You lose",srp[randNum],srp[inputSRP]);
        }
    }
}