import java.util.Scanner;

public class CheckValuePresentInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {5, 1, 1, 9, 7, 2, 6, 10};
        System.out.println("Enter element to be searched");
        int element = scanner.nextInt();
        boolean check = false;

        for (int i = 0; i < array.length; i++) {
            if (element == array[i]){
                check = true;
                break;
            }
        }
        System.out.println(check);
    }
}
