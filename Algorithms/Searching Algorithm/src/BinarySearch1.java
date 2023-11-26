public class BinarySearch1 {
    public static void main(String[] args) {

        int[] nums = {1, 4, 5, 10, 17, 30, 31, 49, 53, 54, 62};
        int target = 56;

        int value = binarySearch(nums, target, 0, nums.length-1);
        System.out.println(value);
    }

    static  int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < nums[middle])
                return binarySearch(nums, target, start, middle - 1);
            else if (target > nums[middle])
                return binarySearch(nums, target, middle + 1, end);
            else return middle;
        }
        return -1;
    }
}
