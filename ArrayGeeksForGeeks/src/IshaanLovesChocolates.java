public class IshaanLovesChocolates {
    public static void main(String[] args) {
        int arr[ ] = {5, 3, 0, 6, 9};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
