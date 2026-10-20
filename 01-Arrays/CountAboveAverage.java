public class CountAboveAverage {
    public static int countAvg(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double avg = sum / nums.length;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > avg) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };
        System.out.println(countAvg(nums));
    }
}
