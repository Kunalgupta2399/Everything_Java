import java.util.HashSet;
import java.util.Set;

public class CheckTwoArraysAreEqual {
    public static void main(String[] args) {
        int A[] = {1,2,5,4,0};
        int B[] = {2,4,5,0,1};

        Set<Integer> set = new HashSet<>();

        for (int element:A) {
            set.add(element);
        }
        for (int element:B) {
            set.add(element);
        }
        System.out.println(set);
    }
}
