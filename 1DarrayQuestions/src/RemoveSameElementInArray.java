import java.util.Arrays;
import java.util.Scanner;

public class RemoveSameElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {3, 9, 2, 3, 1, 7, 2, 3, 5};

        System.out.println("Enter you element to remove which occur multiple times");
        int element = scanner.nextInt();

        array = removeSame(array , element);
        System.out.println(Arrays.toString(array));
    }

    private static int[] removeSame(int[] arr , int element) {
        // Move all other elements to beginning
        int index = 0;
        for (int i=0; i<arr.length; i++)
            if (arr[i] != element)
                arr[index++] = arr[i];

        // Create a copy of arr[]
        return Arrays.copyOf(arr, index);
    }

}
