import java.util.Arrays;

public class NeedSomeChange {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        for (int i = 0; i < a.length-2; i++) {
            int temp = a[i];
            a[i] = a[i+2];
            a[i+2] = temp;
        }
        System.out.print(Arrays.toString(a));
    }
}
