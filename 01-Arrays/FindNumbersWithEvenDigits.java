public class FindNumbersWithEvenDigits {
    public static int findNumbers(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int digits = 0;

            while(nums[i] != 0) {
                nums[i] = nums[i] / 10;
                digits++;
            }

            if(digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,54,3,25,8,3,6};
        System.out.println(findNumbers(nums));
    }
}
