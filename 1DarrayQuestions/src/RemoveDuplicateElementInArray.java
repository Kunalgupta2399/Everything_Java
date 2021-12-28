public class RemoveDuplicateElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        print(array);
        array = removeDuplicate(array);
        print(array);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
        System.out.println();
    }

    private static int[] removeDuplicate(int[] array) {
        int j = 0;
        int[] temp = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j] = array[i];
                j++;
            }
        }
        temp[j] = array[array.length - 1];
        return array;
    }
}
