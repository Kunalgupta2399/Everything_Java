import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {23, 45, 1, 2, 4, 67, 8, 6};

        Arrays.sort(array);

        print(array);

        System.out.println("Enter your element");
        int element = scanner.nextInt();

        int searchIndex = binarySearch(array, element);

        System.out.println("Position of your element is " + " ," + searchIndex);
    }

    private static int binarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (element > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
        System.out.println();
    }
}
