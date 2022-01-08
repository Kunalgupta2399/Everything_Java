import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int []a = { 5,15,3,10,5,10};
        int []b = { 5,3, 15,10,4,10};

        Set<Integer> set = new HashSet<>();

        for (int x:a) {
            set.add(x);
        }
        int count = 0;
        for (int x:b) {
            if (set.contains(x)){
               count++;
               set.remove(x);
            }
        }
        System.out.println(count);
    }
}
