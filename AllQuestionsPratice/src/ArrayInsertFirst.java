import java.util.Scanner;

public class ArrayInsertFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, 5};
        print(a);

        System.out.println("Enter your element");
        int element = scanner.nextInt();
        a = insertFirst(a, element);

        print(a);

    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"----"+i);
        }
    }

    private static int[] insertFirst(int[] a, int element) {
        int[] newArray = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            newArray[i + 1] = a[i];
        }
        newArray[0] = element;

        return newArray;
    }
}
