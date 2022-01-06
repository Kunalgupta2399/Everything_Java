public class MultiplySumLeftToRight {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum = sum + arr[i];
        }
        for (int i = arr.length/2; i < arr.length ; i++) {
            sum2 = sum2 + arr[i];
        }
        int total = sum * sum2;
        System.out.println(total);
    }
}
