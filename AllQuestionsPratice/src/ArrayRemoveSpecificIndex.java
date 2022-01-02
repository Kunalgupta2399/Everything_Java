import java.util.Scanner;

public class ArrayRemoveSpecificIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        print(a);

        System.out.println("Enter the index you want to remove");
        int index = scanner.nextInt();

        a = removeIndex(a, index);
        print(a);
    }

    private static int[] removeIndex(int[] a, int index) {
        int[] newArray = new int[a.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = a[i];
        }
        for (int i = index + 1; i < a.length; i++) {
            newArray[i - 1] = a[i];
        }
        return newArray;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ,");
        }
        System.out.println();
        System.out.println("------");
    }
}
