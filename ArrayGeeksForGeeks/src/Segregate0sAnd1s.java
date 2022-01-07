public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 0};
        print(arr);
         seggreArr(arr);
        print(arr);
    }

    private static void seggreArr(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           // it counts zero
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int j = 0; j < count; j++) {
            // this loop goes till count and store zero
            arr[j] = 0;
        }
        for (int k = count; k < arr.length ; k++) {
            // at the end it stores one
            arr[k] =1;
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
        System.out.println("-------");
    }
}
