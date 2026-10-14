public class SingleNumber {

    public static int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i != j) {
                    count++;
                }
            }
            if(count == 0) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2,4,7};

        System.out.println(singleNumber(nums));
    }
}