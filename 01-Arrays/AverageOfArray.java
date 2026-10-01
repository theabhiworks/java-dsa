public class AverageOfArray {
    public static double findAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {

        int[] arr = { 10,20,30,40};
        int[] arr2 = { 5,10};
        int[] arr3 = { 3,6, 9,12, 15};

        System.out.println(findAverage(arr));
        System.out.println(findAverage(arr2));
        System.out.println(findAverage(arr3));
    }
}
