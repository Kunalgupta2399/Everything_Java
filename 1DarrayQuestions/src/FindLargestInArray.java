public class FindLargestInArray {
    public static void main(String[] args) {
        int[] array = {20, 10, 20, 4, 100};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);

    }

}
