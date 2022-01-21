import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};

        int x = 0;
        int y = a.length-1;

        while (x <= y){
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
            x++;
            y--;
        }
        System.out.println(Arrays.toString(a));
    }
}
