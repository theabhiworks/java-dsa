public class SumOfEvenNumber {
    public static int findSum(int[] nums) {
        int sum = 0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
        
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(findSum(nums));
    }
}
