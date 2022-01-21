public class CountZeroInSortedMatrix {
    public static void main(String[] args) {
        int[][] A = {{4, 5, 6},
                     {0, 0, 1},
                     {0, 1, 1}};
        countZero(A);

    }

    private static void countZero(int[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}
