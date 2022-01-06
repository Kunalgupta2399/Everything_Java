public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 0, 3, 2, 4, 5};
        print(a);
        findLargest(a);
        print(a);
    }

    private static int findLargest(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("------------");
    }
}
