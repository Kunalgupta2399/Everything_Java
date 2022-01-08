import java.util.Arrays;

public class CheckIfAStringIsIsogramOrNot {
    public static void main(String[] args) {
        String S = "geeks";
        System.out.println(isogram(S));
    }

    private static boolean isogram(String s) {
        boolean b = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <s.length()-1 ; j++) {
                if (s.charAt(i) == s.charAt(j+1)){
                    b = false;
                    break;
                }
            }
        }
        return b;
    }
}
