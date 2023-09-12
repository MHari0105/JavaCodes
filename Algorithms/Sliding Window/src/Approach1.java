public class Approach1 {

    static int current=0, maximum=Integer.MIN_VALUE;

    static int maxSum(int[] nums, int k) {

        for (int i=0; i<=nums.length-k; i++) {
            for (int j=i; j<i+k; j++) {
                current += nums[j];
            }
            maximum = Math.max(maximum, current);
            current = 0;
        }
        return maximum;
    }
}
