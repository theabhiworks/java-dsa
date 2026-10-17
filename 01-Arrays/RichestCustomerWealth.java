public class RichestCustomerWealth {
    public static int maximumWealth(int[][] nums) {
        int maxWealth = 0;
        for (int i = 0; i < nums.length; i++) {
            int wealth = 0;
            for (int j = 0; j < nums[i].length; j++) {
                wealth += nums[i][j];
            }
            if (maxWealth < wealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3,1 },
                { 3, 2, 1,5 }
        };
        System.out.println(maximumWealth(nums));
    }
}
