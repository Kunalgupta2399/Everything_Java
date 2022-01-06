public class MaxProAndMinInBothArray {
    public static void main(String[] args) {
        int[] a = {5, 7, 9, 3, 6, 2};
        int[] b = {1, 2, 6, 12, -1, 9};

        int max = a[0];
        int min = b[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        System.out.println(max * min);
    }
}
