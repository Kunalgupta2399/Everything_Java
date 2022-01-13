public class MergeSort {
    public static void main(String[] args) {
        int[] array = {8, 1, 3, 0, 6, 9, 2, 8, 4, 3};
//        int[] a = {1, 3, 5, 6, 7};
//        int[] b = {2, 4, 6, 8, 10, 12};

//        printArray(a);
//        printArray(b);
//
//        int[] c = merge2(a, b);

        printArray(array);

        array = mergeSort(array);

        printArray(array);
    }

    private static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        int[] right = new int[array.length - mid];
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }


    private static int[] merge(int[] a, int[] b) {
        // create a new array of length a + b
        int[] c = new int[a.length + b.length];
        //we will consider 3 index iterators;
        // i for a
        // j for b
        // k for c
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }


    private static void printArray(int[] array) {

        System.out.println("----------------------");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("----------------------");
    }
}
