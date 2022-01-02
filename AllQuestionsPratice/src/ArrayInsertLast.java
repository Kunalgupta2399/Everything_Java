import java.util.Scanner;

public class ArrayInsertLast {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        print(a);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to insert At last of an array");
        int element = scanner.nextInt();

        a = insertLast(a, element);

        print(a);

    }

    private static int[] insertLast(int[] a, int element) {
        int[] newArray = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }

        newArray[a.length] = element;
        return newArray;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " ---" + a[i]);
        }
    }
}
