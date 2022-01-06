import java.util.Scanner;

public class FindSmallerElement {
    public static void main(String[] args) {
        int [] a = {1, 2, 4, 5, 8, 10};
        System.out.println(findSmall(a));

    }

    private static int findSmall(int[] a) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter you number");
        int x = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= x){
                count++;
            }
        }
        return count;
    }
}
