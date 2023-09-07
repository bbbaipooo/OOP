import java.util.Scanner;

public class Pro5_1_64011041 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 2, b = 1;
        for (int y = 1; y <= n; ++y) {
            for (int x = 1; x <= (2 * n) - 1; ++x) {
                if (x + y < n + 1) {
                    System.out.printf("  ", x, y);
                }
                if ((x + y > n) && (x < n) && (a >= 2)) {
                    System.out.printf("%d ", a);
                    --a;
                } else if (x >= n && b <= y) {
                    System.out.printf("%d ", b);
                    ++b;
                }
            }
            a = b;
            b = 1;
            System.out.print("\n");
        }
    }
}
