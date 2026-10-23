// public class MovesZero {

//     public static void movesZero(int[] arr) {
//         int nonZeroIndex = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 arr[nonZeroIndex] = arr[i];
//                 nonZeroIndex++;
//             }
//         }
//         while (nonZeroIndex < arr.length) {
//             arr[nonZeroIndex] = 0;
//             nonZeroIndex++;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 0, 2, 0, 4, 9 };
//         movesZero(arr);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.Arrays;

public class MovesZero {
    public static void movesZero(int[] nums) {
    int i = 0;
    for(int j = 0; j < nums.length; j++ ){
        if(nums[j] != 0){
            swap(nums,i,j);
            i++;
        }
    }
}
    public static void swap(int[] nums, int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        movesZero(nums);
        System.out.println(Arrays.toString(nums));
        
    }
}