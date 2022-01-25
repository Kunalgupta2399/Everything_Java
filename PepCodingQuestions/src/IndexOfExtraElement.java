public class IndexOfExtraElement {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 9, 7, 7};
        int b[] = {1, 2, 3, 4, 9, 6};

        for (int i = 0; i <= b.length - 1; i++) {
            if (a[i] == b[i]) {
                continue;
            } else {
                System.out.println(i);//index
            }
            System.out.println(a[i]); // value
        }
    }
}
