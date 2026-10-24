import java.util.Arrays;

public class RemoveDuplicates2 {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for(int j = 0; j < nums.length; j++){
            if(k < 2 || nums[j] !=  nums[k - 2]) {
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3};
        int k = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
