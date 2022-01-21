import java.util.Arrays;

public class SumOfTwoArray {
    public static void main(String[] args) {
        int[] a =        {3, 1, 0, 7, 5};
        int[] b = {9, 3, 1, 1, 1, 1 , 1};
        int[] c;
        if (a.length > b.length) {
            c = new int[a.length];
        } else {
            c = new int[b.length];
        }

        int x = a.length - 1;
        int y = b.length - 1;
        for (int i = c.length - 1; i >= 0; i--) {
            if (x >= 0 && y >= 0) {
                c[i] = a[x] + b[y];
                x--;
                y--;
            } else if (x >= 0) {
                c[i] = a[x];
                x--;
            } else if (y >= 0) {
                c[i] = b[y];
                y--;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
