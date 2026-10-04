public class MissingSum {

    public static int findMissing(int[] arr) {
        int missing = 0;
        int sum = 0;
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            missing = expectedSum - sum;

        }
        return missing;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7 };
        System.out.println(findMissing(arr));
    }
}
