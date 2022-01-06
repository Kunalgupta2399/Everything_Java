public class NumberIsDivisibleBy3 {
    public static void main(String[] args) {
        int[] arr = {40, 50, 90};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum % 3 == 0);
    }
}
