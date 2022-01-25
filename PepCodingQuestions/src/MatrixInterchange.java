public class MatrixInterchange {
    /*
    Working with 2D arrays is quite important. Here we will do swapping of column in a 2D array. You are given a matrix M or r rows and c columns. You need to swap the first column with the last column.

Example:

Input:
3 4
1 2 3 4
4 3 2 1
6 7 8 9

Output:
4 2 3 1
1 3 2 4
9 7 8 6
Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function interchange(int, int , int ) that take matrix, rows and columns as parameters.

Constraints:
1 <= r,c <= 100

View Bookmarked Problems

     */
    public static void main(String[] args) {
        int row = 3;
        int column = 4;
        int[][] m = {{1, 2, 3, 4},
                     {4, 3, 2, 1},
                     {6, 7, 8, 9}};
        for (int i = 0; i < row; i++) {
            int temp = m[i][0];
            m[i][0] = m[i][column - 1];
            m[i][column - 1] = temp;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(m[i][j] + ",");
            }
            System.out.println();
        }
    }
}
