import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row, column;

        System.out.println("Enter your row:");
        row = scanner.nextInt();
        System.out.println("Enter your column:");
        column = scanner.nextInt();

        int[][] a = new int[row][column];
        int[][] b = new int[row][column];

        inputMatrix(a);
        inputMatrix(b);

        int[][] sum = sumMatrix(a, b);
        int[][] multiply = multiplyMatrix(a, b);
        int[][] difference = differenceMatrix(a, b);

        display(a);
        display(b);
        display(sum);
        display(difference);
        display(multiply);

    }

    private static void display(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    private static int[][] sumMatrix(int[][] a, int[][] b) {
        int rowA = a.length;
        int rowB = b.length;

        int columnA = a[0].length;
        int columnB = b[0].length;

        if (rowA == rowB && columnA == columnB) {
            int[][] sum = new int[rowA][columnA];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            return sum;
        } else {
            System.out.println("Cannot add");
            return null;
        }

    }

    private static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int rowA = a.length;
        int rowB = b.length;

        int columnA = a[0].length;
        int columnB = b[0].length;

        if (columnA != rowA) {
            System.out.println("Can't multiply");
            return null;
        }
        int[][] c = new int[rowA][columnA];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                c[i][j] = 0;
                for (int k = 0; k < columnA; k++) {
                    c[i][j] = c[i][j] + (a[i][j] * b[i][j]);
                }
            }
        }
        return c;
    }

    private static int[][] differenceMatrix(int[][] a, int[][] b) {
        int rowA = a.length;
        int rowB = b.length;

        int columA = a[0].length;
        int columB = b[0].length;

        if (columA == columB && rowA == rowB) {
            int[][] difference = new int[rowA][columA];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columA; j++) {
                    difference[i][j] = a[i][j] - b[i][j];
                }
            }
            return difference;
        } else {
            System.out.println("Cannot Difference");
            return null;
        }
    }

    private static void inputMatrix(int[][] matirx) {
        Scanner scanner = new Scanner(System.in);
        int row = matirx.length;
        int column = matirx[0].length;

        System.out.println("Enter you matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matirx[i][j] = scanner.nextInt();
            }
        }
    }
}
