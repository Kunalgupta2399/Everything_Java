import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void main(String[] args) {
        int [] a = { 1,3,4,3,5,1,3};

        Set<Integer> set = new HashSet<>();
        for (int element:a) {
            set.add(element);
        }
        System.out.println(set.size());
    }
}
