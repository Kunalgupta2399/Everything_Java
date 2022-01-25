import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = 0; i < a.length-3; i++) {
            int temp = a[i];
            a[i] = a[i + 3];
            a[i + 3] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
