import java.util.Scanner;

public class AddTwoComplexNumbers {
    //a+ib
    //add real with real part adn add imaginary with imaginary part
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your real part");
        int real = scanner.nextInt();
        System.out.println("Enter your imaginary part");
        int imaginary = scanner.nextInt();
        System.out.println("Enter your real part");
        int real1 = scanner.nextInt();
        System.out.println("Enter your imaginary part");
        int imaginary1 = scanner.nextInt();
        System.out.println("Your result is : "+(real + real1)+"+4525"+(imaginary + imaginary1)+"i");

    }
}
