public class PrintSubArrayContainsZero {
    public static void main(String[] args) {
        int []a = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        printAllSubArray(a);
    }

    private static void printAllSubArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length ; j++) {
                sum = sum + a[j];

                if (sum == 0){
                    System.out.println("{"+a[i] +" ,"+a[j]+"}");
                }
            }
        }
    }
}
