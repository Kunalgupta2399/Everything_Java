public class DisplayLongestName {
    public static void main(String[] args) {
        String names[] = { "Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks" };
        String max = names[0];
        int length = names[0].length();
        for (int i = 0; i < names.length; i++) {
            if (length < names[i].length()){
                max = names[i];
            }
        }
        System.out.println(max);
    }
}
