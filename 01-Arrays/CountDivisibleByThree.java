public class CountDivisibleByThree {
    public static int countNum(int[] nums) {
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] % 3 == 0){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {3,7,9,12,14,18};
        System.out.println(countNum(nums));
        }
}
