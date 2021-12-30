import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        //define array
        int[] a = {10, 20, 30, 40};
        int[] b = {50, 60, 70, 80};

        // find length
        int a1 = a.length;
        int b1 = b.length;

        //store in resultant array
        int c1 = a1 + b1;
        int[] c = new int[c1];

        // using JDK or predefined function to copy ARRAY
//        System.arraycopy(a, 0, c, 0, a1);
//        System.arraycopy(b, 0, c, a1, b1);
//
//        // print
//
//        System.out.println(Arrays.toString(c));

        //USING SECOND METHOD

        for (int i = 0; i < a1; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b1; i++) {
            c[a1 + i] = b[i];
        }

        for (int i = 0; i < c1; i++) {
            System.out.print(c[i] + ",");
        }
    }
}
