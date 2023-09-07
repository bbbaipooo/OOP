import java.util.Scanner;

public class Pro3_64011041 {
    public static void main(String[] args) {
        int i = 0, di = 0, supdi = 0, subdi = 0;

        System.out.print("Enter the size for the matrix:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);// random0,1
                System.out.print(matrix[row][column] + " ");

                if (column > row && column == row + 1) {
                    supdi += matrix[row][column];
                }
                if (column == row) {
                    di += matrix[row][column];
                }
                if (column < row && column == row - 1) {
                    subdi += matrix[row][column];
                }
            }
            System.out.print("\n");
        }

        // rowCheck(matrix);
        superdiagonal(supdi, size);
        diagonal(di, size);
        subdiagonal(subdi, size);

    }

    public static void rowCheck(int[][] matrix) {
        int i = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] == matrix[row][column + 1]) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.printf("All 0s on row %d\n", row);
            } else if (i == matrix.length) {
                System.out.printf("All 1s on row %d\n", row);
            }
        }
        if (i != 0 && i != matrix.length) {
            System.out.println("No same numbers on a row\n");
        }
    }

    public static void superdiagonal(int supdi, int size) {
        if (supdi == 0) {
            System.out.println("All 0s on superdiagonal");
        } else if (supdi == size - 1) {
            System.out.println("All 1s on superdiagonal");
        } else {
            System.out.println("No same numbers on the superdiagonal");
        }
    }

    public static void diagonal(int di, int size) {
        if (di == 0) {
            System.out.println("All 0s on diagonal");
        } else if (di == size) {
            System.out.println("All 1s on diagonal");
        } else {
            System.out.println("No same numbers on the diagonal");
        }
    }

    public static void subdiagonal(int subdi, int size) {
        if (subdi == 0) {
            System.out.println("All 0s on subdiagonal");
        } else if (subdi == size - 1) {
            System.out.println("All 1s on subdiagonal");
        } else {
            System.out.println("No same numbers on the subdiagonal");
        }
    }
}
