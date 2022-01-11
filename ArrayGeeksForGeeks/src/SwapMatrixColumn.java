import java.util.Scanner;

public class SwapMatrixColumn {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        inputMatrix(matrix);
        print(matrix);
        swapColumn(matrix);
        print(matrix);
    }

    private static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] +" ,");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    private static void swapColumn(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i][0];
            a[i][0] = a[i][2];
            a[i][2] = temp;
        }

    }

    private static void inputMatrix(int[][] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }
}
