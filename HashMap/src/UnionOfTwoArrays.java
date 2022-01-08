import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int a[] = {5, 10, 15, 5};
        int b[] = {10, 15, 4, 5};

        Set<Integer> set = new HashSet<>();

        for (int x:a) {
            set.add(x);
        }
        for (int x: b) {
            set.add(x);
        }
        System.out.println(set.size());
    }
}
