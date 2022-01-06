public class FormANumberDivisibleBy3 {
    public static void main(String[] args) {
        int[] arr = {40, 50, 90};
        System.out.println(divisibleByThree(arr));



    }

    private static int divisibleByThree(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             sum =+ arr[i];
             if (sum % 3 ==0){
                 return 1;
             }
        }
        return 0;
    }
}
