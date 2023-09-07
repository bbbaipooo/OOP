import java.util.Scanner;

public class program003 {
    public static void main(String[] args) {
        int i=0,di = 0, superdi = 0, subdi = 0;

        System.out.print("Enter the size for the matrix:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
         
        // generate matrix
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
                System.out.print(matrix[row][column] + " ");

                if (column > row && column == row + 1) {
                    superdi += matrix[row][column];
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
        //check row
       int colum=0;
        int row=0;
        for (int k = 0; k < 2; k++) {
            for (int p = 0; p < matrix.length; p++) {
                if (rowCheck(matrix,k,p)) {
                    System.out.println("All " + k + "s on row " + p);
                    row++;
                }
            }

        }
        //check colum
        for (int k = 0; k < 2; k++) {
            for (int h = 0; h < matrix.length;h++) {
                if (columCheck(matrix,k,h)) {
                    System.out.println("All " + k + "s on column " + h);
                    colum++;
                }
            }

        }
        if (row == 0) {
            System.out.println("No same numbers on a row");
        }
        if (colum == 0) {
            System.out.println("No same numbers on a column");
        }

        //check sup sub di
        superdiagonal(superdi, size);
        diagonal(di, size);
        subdiagonal(subdi, size);
        
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
    public static boolean rowCheck(int[][] m, int n, int row) {

        for (int k = 0; k < m[row].length; k++) {
            if (m[row][k] != n) return false;
        }
        return true;
    }
    public static boolean columCheck(int[][] m, int n, int column) {

        for (int i = 0; i < m.length; i++) {
            if (m[i][column] != n) return false;
        }
        return true;
    }
}