public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 8, 7, 56, 90};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
