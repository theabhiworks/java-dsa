public class CheckSorted {

    public static boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 12, 20 };
        System.out.println(isSorted(arr));
    }
}