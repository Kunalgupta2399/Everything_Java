import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int a[]= {0,2,1,2,0};
        print(a);
        Arrays.sort(a);
        print(a);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();}

    private static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int max = a[0];
           if (a[i] > max){
              max = a[i];
           }
        }
        return a;
    }
}
