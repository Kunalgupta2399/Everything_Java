import java.util.Scanner;

public class ArrayInsertionSort {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your Array size");
        int n = scanner.nextInt();

        int[] a = inputArray(n);
        print(a);

        a = insertionSort(a);
        print(a);

    }

    private static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int temp = a[i];

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        return a;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("--------");
    }

    private static int[] inputArray(int n) {
        System.out.println("Enter you array");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
