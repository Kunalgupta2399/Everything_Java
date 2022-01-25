public class FindTransitionPoint {
    public static void main(String[] args) {
        int a[] = {0, 0, 0, 0, 1};
        int tp = -1;
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == 1) {
                tp = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(tp);
    }
}
