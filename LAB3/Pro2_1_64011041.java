import java.util.Scanner;
import java.util.Arrays;

public class Pro2_1_64011041 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1=new int[input.nextInt()];
        for(int i=0;i<list1.length;i++)
        {
            list1[i]=input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2=new int[input.nextInt()];
        for(int i=0;i<list2.length;i++)
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
