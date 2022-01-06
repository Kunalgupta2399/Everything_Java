public class BalancedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1, 3 };
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < arr.length / 2; i++) {
           sum += arr[i];
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            sum1 += arr[i];
        }
        System.out.println(sum1 - sum);
    }
}
