public class MaximumDifference {
    public static int maxDifference(int[] arr) {
        int maxDifference = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int difference = arr[j] - arr[i];
                if(difference > maxDifference){
                    maxDifference = difference;
                }
            }
        }
        return maxDifference;
    } 
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxDifference(arr));
    }
}
