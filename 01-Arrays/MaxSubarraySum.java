public class MaxSubarraySum {
    public static int maxSubarraySum(int[] nums) {
    int currentMax = 0;
        int max = nums[0];
        int totalSum = 0;
        int currentMin = 0;
        int min = nums[0];
        for (int num : nums) {
            currentMin = Math.min(num, currentMin + num);
            min = Math.min(min, currentMin);

            currentMax = Math.max(num, currentMax + num);
            max = Math.max(max, currentMax);
            totalSum += num;
        }
        if (max < 0) {
            return max;
        }
        int circularSum = totalSum - min;
        return Math.max(max, circularSum);
    }
    public static void main(String[] args) {
        int[] nums = {-2,4,-1,4};
        System.out.println(maxSubarraySum(nums));
    }
}

