import java.util.Scanner;
import java.util.Arrays;

public class Pro2_64011041 {
    public static void main(String[] args) {
        int[] list1=new int[5];
        int[] list2=new int[4];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list1: ");
        for(int i=0;i<5;i++)
        {
            list1[i]=input.nextInt();
        }
        System.out.print("Enter list2: ");
        for(int i=0;i<4;i++)
        {
            list2[i]=input.nextInt();
        }

        int[] result = merge(list1,list2);

        //System.out.println(Arrays.toString(result));

        Arrays.sort(result);//เรียงลำดับน้อยไปมาก

        System.out.println(Arrays.toString(result));//Show string in array
    }

    public static int[] merge(int[] list1, int[] list2) {
        int list1_length = list1.length;
        int list2_length = list2.length;

        int list3_length = list1_length + list2_length;
        int[] list3 = new int[list3_length];

        System.arraycopy(list1,0,list3,0,list1_length);
        System.arraycopy(list2,0,list3,list1_length,list2_length);

        return list3;
    }
}
