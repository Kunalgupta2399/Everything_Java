import java.util.Scanner;

public class ArraysSumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number to be sum");
        int input = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i < input; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
