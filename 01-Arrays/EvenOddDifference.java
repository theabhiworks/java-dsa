public class EvenOddDifference {
    public static int findDiference(int[] nums) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] %2 ==0 ) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }
        return evenSum - oddSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(findDiference(nums));
    }
}
