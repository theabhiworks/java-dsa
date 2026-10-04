public class FindDuplicates {

    public static int findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3,3,3,4,4,5,5,5,5 };
        System.out.println(findDuplicates(arr));
    }
}