import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int i = 0;
        int j = nums.length;

        while(i < j) {
            if(nums[i] == val) {
                nums[i] = nums[j - 1];
                j--;
            } else {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,2,4};
        int newLength = removeElement(nums, 2);
        System.out.println("Remaining elements: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
