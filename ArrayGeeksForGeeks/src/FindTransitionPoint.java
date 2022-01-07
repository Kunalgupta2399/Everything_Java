public class FindTransitionPoint {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1};
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] == 1){
                System.out.print(i);
                break;
            }
        }
    }
}
