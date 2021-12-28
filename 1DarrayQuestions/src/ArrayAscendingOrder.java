public class ArrayAscendingOrder {
    public static void main(String[] args) {
        int[] array = {-5, -9, 8, 12, 1, 3};

        print(array);
        array = sortArray(array);
        print(array);


    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
        System.out.println();
    }

    private static int[] sortArray(int[] array) {
        // using bubble sort
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
