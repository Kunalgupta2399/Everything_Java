import java.util.Arrays;

public class MinimizeTheSum {
    public static void main(String[] args) {
        int a[] = {3, 1, 1};
        int b[] = {6, 5, 4};
        Arrays.sort(a);//{1,1,3}
        Arrays.sort(b);//{4,5,6}
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (long) a[i] * b[b.length - i - 1];
        }
        System.out.println(sum);
    }
}
