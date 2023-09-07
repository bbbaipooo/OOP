import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] data1 = new int[in.nextInt()];
        for (int i = 0; i < data1.length; i++) {
            data1[i] = in.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] data2 = new int[in.nextInt()];
        for (int i = 0; i < data2.length; i++) {
            data2[i] = in.nextInt();
        }

        int[] data3 = merge(data1, data2);

        Arrays.sort(data3);

        System.out.println(Arrays.toString(data3));
        in.close();
    }

    private static int[] merge(int[] data1, int[] data2) {
        int data1_length = data1.length ;
        int data2_length = data2.length ;

        int data3_length=data1_length+data2_length;
        int[]data3=new int[data3_length];

        System.arraycopy(data1,0,data3,0,data1_length);
        System.arraycopy(data2,0,data3,data1_length,data2_length);
        
        return data3;
    }
}
