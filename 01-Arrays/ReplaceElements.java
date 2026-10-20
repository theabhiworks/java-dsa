public class ReplaceElements {
    public static int[] replaceElements(int[] nums){
        for(int i = 0; i< nums.length; i++){
            int max = -1;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            nums[i] = max;  
        }
        return nums;
    }

    public static void main(String[] args) {
         int[] nums = {17, 18, 5, 4, 6, 1};

        replaceElements(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
