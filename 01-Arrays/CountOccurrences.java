
public class CountOccurrences {

    public static int countNum(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 5, 8, 5, 2, 5 };
        System.out.println(countNum(arr, 5));
    }
}