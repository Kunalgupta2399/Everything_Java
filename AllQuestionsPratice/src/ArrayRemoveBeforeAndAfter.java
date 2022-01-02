import java.util.Scanner;

public class ArrayRemoveBeforeAndAfter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6};
        print(a);

        System.out.println("Enter the element After/Before you want to remove");
        int element = scanner.nextInt();

//        a = removeBefore(a, element);
        a = removeAfter(a, element);
        print(a);

    }

    private static int[] removeAfter(int[] a, int element) {
        int[] newArray = new int[a.length - 1];

        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                index = i;
            }
        }
        index++;

        for (int i = 0; i < index; i++) {
            newArray[i] = a[i];
        }
        for (int i = index; i < a.length; i++) {
            newArray[i - 1] = a.length;
        }
        return newArray;
    }

    private static int[] removeBefore(int[] a, int element) {
        int[] newArray = new int[a.length - 1];

        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = a[i];
        }
        for (int i = index; i < a.length; i++) {
            newArray[i - 1] = a[i];
        }
        return newArray;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + "--" + a[i]);
        }
        System.out.println("--------");
    }
}
