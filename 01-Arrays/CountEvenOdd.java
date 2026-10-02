

public class CountEvenOdd {

    public static void findEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even : " + evenCount);
        System.out.println("Odd : " + oddCount);
     }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 4, 80, 8, 21 };
        findEvenOdd(arr);
    }
}