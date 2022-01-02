public class ArrayRemoveFirstAndLast {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        print(a);

//        a = removeFirst(a);
        a = removeLast(a);

        print(a);
    }

    private static int[] removeLast(int[] a) {
        int[] newArray = new int[a.length - 1];
        for (int i = 0;  i < a.length - 1; i++) {
            newArray[i] = a[i];
        }
        return newArray;
    }

    private static int[] removeFirst(int[] a) {
        int[] newArray = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            newArray[i - 1] = a[i];
        }
        return newArray;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + "---" + a[i]);
        }
        System.out.println("-----------");
    }
}
