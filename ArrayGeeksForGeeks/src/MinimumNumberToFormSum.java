public class MinimumNumberToFormSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 7, 8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 ==0){
            System.out.println(2);
        }else {
            System.out.println(sum % 2);
        }
    }
}
