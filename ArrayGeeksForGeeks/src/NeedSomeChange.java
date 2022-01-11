public class NeedSomeChange {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        print(arr);
        swapArray(arr);
        print(arr);

    }

    private static void swapArray(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] =temp;
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("----------");
    }
}
