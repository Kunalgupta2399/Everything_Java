import java.util.Scanner;

public class DisplayPrimeNumberTillN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = scanner.nextInt();


        for (int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }


}
