public class Approach2 {

    static int window = 0, maximum = Integer.MIN_VALUE;

    public static int maxWindowSum(int[] nums, int k) {

        for (int i=0; i<k; i++) {
            window += nums[i];
        }

        for (int i=k; i<nums.length; i++) {
            window = window - nums[i-k] + nums[i];
            maximum = Math.max(maximum, window);
        }

        return maximum;
    }
}