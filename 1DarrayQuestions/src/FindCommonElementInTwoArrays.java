import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementInTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = {"Article", "for", "Geeks", "for", "Geeks"};
        String[] arr2 = {"Article", "Geeks", "for", "Geeks"};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Common element :");
        findCommonElements(arr1, arr2);

    }

    private static void findCommonElements(String[] arr1, String[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    set.add(Integer.valueOf(arr1[i]));
                    break;
                }
            }
        }
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }
}
