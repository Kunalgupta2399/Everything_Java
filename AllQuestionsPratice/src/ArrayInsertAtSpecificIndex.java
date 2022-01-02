import java.util.Scanner;

public class ArrayInsertAtSpecificIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

        print(a);

        System.out.println("Enter you index");
        int index = scanner.nextInt();

        System.out.println("Enter your element");
        int element = scanner.nextInt();

        a = insertSpecificIndex(a, index, element);

        print(a);


    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + "----" + a[i]);
        }
    }

    private static int[] insertSpecificIndex(int[] a, int index, int element) {
        int[] newArray = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = a[i];
        }
        for (int i = index; i < a.length ; i++) {
            newArray[i+1] = a[i];
        }
        newArray[index] = element;

        return newArray;
    }
}
