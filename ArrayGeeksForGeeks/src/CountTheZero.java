public class CountTheZero {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
