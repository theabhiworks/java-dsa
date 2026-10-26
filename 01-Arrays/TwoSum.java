// public class TwoSum {
//     public static int[] twoSum(int[] arr, int target) {
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = i + 1; i< arr.length; j++){
//                 if(arr[i] + arr[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{-1,-1};
//     }

//     public static void main(String[] args) {
//         int[] arr = {2,11,7,15};
//         int[] result = twoSum(arr, 9);
//         System.out.println(result[0] + ", " + result[1]);
//     }
// }



import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length  - 1;
        while(left < right){
            int sum = nums[left] + nums[right];

            if(target == sum) {
                return new int[]{left+1, right+1};
            } else if(sum < target){
                left++;
            } else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 18;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}