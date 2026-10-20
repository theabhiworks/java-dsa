public class LargestInEachRow {
    public static void findLarge(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
           int max = nums[i][0];
           for(int j = 1; j< nums[i].length; j++) {
                if(nums[i][j] > max) {
                    max = nums[i][j];
                }
           }
           System.out.println(max);
        }
    }

    public static void main(String[] args) {
        int[][] nums = {
            {3, 7, 2},
            {9, 1, 5},
            {4, 8, 6}
        };

        findLarge(nums);
    }
}
