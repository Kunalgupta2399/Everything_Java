public class LeaderInArray {
    public static void main(String[] args) {
        int a[] = {16,17,4,3,5,2};


        for (int i = 0; i < a.length; i++) {
            boolean greater = true;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] > a[i]){
                    greater = false;
                    break;
                }
            }if (greater){
                System.out.println(a[i]);
            }
        }
    }

}
