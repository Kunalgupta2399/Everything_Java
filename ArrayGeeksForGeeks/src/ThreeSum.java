public class ThreeSum {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 4, 7, 5, 9, 10};
        int x = 12;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == x){
                        System.out.print(a[i] +" ,");
                        System.out.print(a[j] +" ,");
                        System.out.println(a[k] +" ,");
                        System.out.println("---------");
                    }
                }
            }
        }
    }
}
