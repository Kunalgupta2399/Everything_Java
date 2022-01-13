public class PrintMatrixInSnake {
    public static void main(String[] args) {
        int matrix[][] = {{45, 48, 54}, {21, 89, 87}, {70, 78, 15}};
        matrixSnake(matrix);
    }

    private static void matrixSnake(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j]+",");
                }
                System.out.println();
            } else {
                for (int j = matrix.length-1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + ",");
                }
                System.out.println();
            }
        }
    }
}
