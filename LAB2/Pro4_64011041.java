import java.util.Scanner;       //Bugเว้นวรรคตอนinput

import javax.lang.model.util.ElementScanner14;

public class Pro4_64011041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String nameC_1 = input.next(); //input string
        char a = nameC_1.charAt(0);    //string return to character

        System.out.print("Enter the second city: ");
        String nameC_2 = input.next();
        char b = nameC_2.charAt(0);

        System.out.print("Enter the third city: ");
        String nameC_3 = input.next();
        char c = nameC_3.charAt(0);

        System.out.print("The three cities in alphabetical order are ");
        if((a<b)&&(a<c))
        {
            if(b<c)
            {
                System.out.printf("%s %s %s",nameC_1,nameC_2,nameC_3);
            }
            else
            {
                System.out.printf("%s %s %s",nameC_1,nameC_3,nameC_2);
            }
        }
        else if((b<a)&&(b<c))
        {
            if(a<c)
            {
                System.out.printf("%s %s %s",nameC_2,nameC_1,nameC_3);
            }
            else
            {
                System.out.printf("%s %s %s",nameC_2,nameC_3,nameC_1);
            }
        }
        else
        {
            if(a<b)
            {
                System.out.printf("%s %s %s",nameC_3,nameC_1,nameC_2);
            }
            else
            {
                System.out.printf("%s %s %s",nameC_3,nameC_2,nameC_1);
            }
        }
    }
}
