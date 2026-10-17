public class CountGreaterThanTarget {

    public static int countGreater(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(countGreater(nums, 3));
    }
}
