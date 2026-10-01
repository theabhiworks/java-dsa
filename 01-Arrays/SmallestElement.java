public class SmallestElement {

    public static int smallestElement(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 15, 2, 19, 6 };
        System.out.println(smallestElement(arr));
    }
}
