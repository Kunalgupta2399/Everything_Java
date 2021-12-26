import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // swap two numbers using user input
        System.out.println("Enter number");
        int n = scanner.nextInt();
        System.out.println("Enter number");
        int m = scanner.nextInt();
        swapNumbers(8 , 35);
    }

    private static void swapNumbers(int n, int m) {
        int temp = n;
        n = m;
        m = temp;
        System.out.println("value of n is " + n + " and value of m is" + m);
    }
}
