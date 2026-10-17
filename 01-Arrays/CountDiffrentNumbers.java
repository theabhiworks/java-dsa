public class CountDiffrentNumbers {

    public static void findnum(int[] nums) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                positive++;
            } else if(nums[i] < 0){
                negative++;
            } else if(nums[i] == 0) {
                zero++;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: "+negative);
        System.out.println("Zero: "+zero);
    }
    public static void main(String[] args) {
        int[] nums = {2,-3,0,5,-1,0,4};
        findnum(nums);
    }
}
