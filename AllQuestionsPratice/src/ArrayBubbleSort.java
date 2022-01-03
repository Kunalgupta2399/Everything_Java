import java.util.Scanner;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array size");
        int n = scanner.nextInt();
        int[] a = inputArray(n);
        print(a);

        a = bubbleSort(a);
        print(a);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("--------");
    }

    private static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    private static int[] inputArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Enter your array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
