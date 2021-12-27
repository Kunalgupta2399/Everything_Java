public class MinMaxArray {
    public static void main(String[] args) {
        int[] a = {12, 3, -45, 66, 677, 87};

        print(a);
        int min = minFromArray(a);
        int max = maxFromArray(a);

        System.out.println(min);
        System.out.println(max);
    }

    private static int maxFromArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    private static int minFromArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ,");
        }
        System.out.println();
    }
}
