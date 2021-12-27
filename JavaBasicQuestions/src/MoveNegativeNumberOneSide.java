public class MoveNegativeNumberOneSide {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, -5, -7, -8, 9, 7};
        print(array);
        array = moveNegative(array);
        print(array);
    }

    private static int[] moveNegative(int[] array) {
        int[] b = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                b[index++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0){
                b[index++] = array[i];
            }
        }
        return b;
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------");
    }

}
