public class SpanOfArray {
    public static void main(String[] args) {
        int [] a = {6 ,15 ,30 ,40 ,4 ,11 ,9};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println(max - min);
    }
}
