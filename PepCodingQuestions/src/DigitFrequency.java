import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
//        int number = 994543234;
//        String str = "" + number;
//        char k = '4';
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == k){
//                count++;
//            }
//        }
//        System.out.println(count);


        int count = 0;
        int number = 994543234;
        int k = 4;
        while (number > 0) {
            int lastDigit = number % 10; // getting the last digit of the number
            if (lastDigit == 4) { // checking condition that input by k
                count++; // storing the value of k
            }
            number = number / 10; // and reducing the number
        }
        System.out.println(count); // print how many times k appear in number
    }
}
