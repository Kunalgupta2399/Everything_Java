import java.util.HashSet;
import java.util.Set;

public class SubArraySum0 {
    public static void main(String[] args) {
        int[] a = {4, -6, 3, -1, 4, 2, 7};
        if (sumArray(a)) {
            System.out.println("SubArray Exists");
        } else {
            System.out.println("not");
        }
    }

    private static boolean sumArray(int[] a) {
        Set<Integer> set = new HashSet<>();
        // create set
        set.add(0);
        // then add 0 , what if subArray start from 0
        int sum = 0;
        // initialize the sum 0

        // traverse the array
        for (int element : a) {
            // add every element to check zero
            sum = sum + element;

            //check if any of addition in array got 0 , that means subArray present
            if (set.contains(sum)){
                return true;
            }
            // if no addition found 0 , add all array element and put in set
            set.add(sum);
        }
        // and return false;
        return false;
    }
}
