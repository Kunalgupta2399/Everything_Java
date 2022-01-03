import java.util.Scanner;

public class ArraySelectionSort {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your array Size");
        int n = scanner.nextInt();

        int[] a = inputArray(n);
        print(a);

         selectionSort(a);
        print(a);
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length ; j++) {
                if (a[j] <  a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("---------");
    }

    private static int[] inputArray(int n) {
        System.out.println("Enter your array");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
