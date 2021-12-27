import java.util.Scanner;

public class FindLargestThreeNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        largestNumber(a, b, c);

    }

    public static void largestNumber(int a, int b, int c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        a = scanner.nextInt();
        System.out.println("Enter your number");
        b = scanner.nextInt();
        System.out.println("Enter your number");
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " " + "greater");
        } else if (b > c && b > a) {
            System.out.println(b + " " + "greater");
        }else{
            System.out.println(c+" "+" greater");
        }

    }
}
