import java.util.Arrays;

public class BinarySearch {
    private final static int SIZE = 100000;

    public static void main(String[] args) {

        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * SIZE);

//            array[array.length - 1] = 45;
            Arrays.sort(array);

            int searchIndex = binarySearch(array, 45);
            System.out.println(searchIndex);
        }
    }

    private static int binarySearch(int[] array, int element) {
        int low = 0 ;
        int high = array.length - 1;
        while(low <= high){
            int mid  = (low + high) /2 ;
            if (array[mid] == element){
                return  mid;
            }else if(element > array[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

}

