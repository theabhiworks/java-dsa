public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[uniqueIndex] != arr[i]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5};
        int uniqueCount = removeDuplicates(arr);

        System.out.println("uniqueElement: " + uniqueCount);

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}