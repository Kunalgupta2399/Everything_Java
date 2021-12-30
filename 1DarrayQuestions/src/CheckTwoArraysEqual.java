public class CheckTwoArraysEqual {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {1, 2, 5, 4, 0};

        boolean result = true;

        // check 1st condition (length is equal of not)
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    result = false;
                }
            }
        }
        else {
            result = false;
        }
        if (result == true){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Array are not equal");
        }
    }
}
