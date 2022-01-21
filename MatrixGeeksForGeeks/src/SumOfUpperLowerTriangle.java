public class SumOfUpperLowerTriangle {
    /*
    Sum of upper and lower triangles
Basic Accuracy: 62.08% Submissions: 12574 Points: 1
Given a square matrix of size N*N, print the sum of upper and lower triangular elements. Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it.

Example 1:

Input:
N = 3
mat[][] = {{6, 5, 4},
           {1, 2, 5}
           {7, 9, 7}}
Output: 29 32
Explanation:
The given matrix is
6 5 4
1 2 5
7 9 7
The elements of upper triangle are
6 5 4
  2 5
    7
Sum of these elements is 6+5+4+2+5+7=29
The elements of lower triangle are
6
1 2
7 9 7
Sum of these elements is 6+1+2+7+9+7= 32.
     */
    public static void main(String[] args) {
      int  n[][] = {{6, 5, 4},
                    {1, 2, 5},
                    {7, 9, 7}};
      int sum_Lower = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum_Lower += n[i][j];
            }
        }
        System.out.println(sum_Lower);
        int sum_Upper =0;
        for (int i = 0; i < n.length; i++) {
            for (int j = n.length-1; j >=i ; j--) {
                sum_Upper += n[i][j];
            }
        }
        System.out.println(sum_Upper);
    }
}
