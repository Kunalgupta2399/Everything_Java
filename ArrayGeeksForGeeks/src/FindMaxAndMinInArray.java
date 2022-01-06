public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        int [] array = {3, 2, 1, 56, 10000, 167};

        System.out.println(findMax(array));
        System.out.println(findMin(array));

    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
