import java.util.Scanner;

public class ArrayInsertBeforeAndAfter {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        print(a);

        System.out.println("Enter the element Before you want to insert");
        int element = scanner.nextInt();


        System.out.println("Enter the new element you want to insert");
        int newElement = scanner.nextInt();

//        a = insertBefore(a, element, newElement);
        a = insertAfter(a, element, newElement);

        print(a);
    }

    private static int[] insertAfter(int[] a, int element, int newElement) {
        int[] newArray = new int[a.length + 1];
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
            newArray[i + 1] = a[i];
        }

        newArray[index] = newElement;
        return newArray;
    }

    private static int[] insertBefore(int[] a, int element, int newElement) {
        int[] newArray = new int[a.length + 1];

        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                index = i;
            }
        }

//        index++; // for after case for before case we do not update it

        for (int i = 0; i < index; i++) {
            newArray[i] = a[i];
        }

        for (int i = index; i < a.length; i++) {
            newArray[i + 1] = a[i];
        }

        newArray[index] = newElement;
        return newArray;
    }


    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "---" + i);
        }
    }
}
