import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 54, 3, 78, 98, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your element");
        int element = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Element found at position" + " " + i + " " + "index");
            }
        }
    }
}
