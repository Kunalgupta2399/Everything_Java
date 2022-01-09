import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairOfSum {
    public static void main(String[] args) {
        int[] a = {8, 7, 2, 5, 3, 1};

        System.out.println( findPairUsingHash(a));

    }

    private static boolean findPairUsingHash(int[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Pair to be find");
        int sum = scanner.nextInt();
        if (a.length == 0 ){
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(sum - a[i])){
                return true;
            }else{
                set.add(a[i]);
            }
        }
        return false;
    }
}
