
public class Q2_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 6, 31, 89, 45};
        int targetElement = 89;

        boolean exists = linearRecursiveSearch(arr, targetElement, 0);
        System.out.println(exists);

        boolean exists2 = searchFromLast(arr, targetElement, arr.length-1);
        System.out.println(exists2);

        int indexValue = indexValue(arr, targetElement, 0);
        System.out.println(indexValue);
    }

    static boolean linearRecursiveSearch(int[] nums, int target, int index) {
        if (index == nums.length)
            return false;
        return nums[index] == target || linearRecursiveSearch(nums, target, index+1);
    }


    static boolean searchFromLast(int[] nums, int target, int last) {
        if (last == -1)
            return false;
        return nums[last] == target || searchFromLast(nums, target, last-1);
    }

    static int indexValue(int[] nums, int target, int index) {
        if (index == nums.length)
            return -1;
        if (nums[index] == target)
            return index;
        return indexValue(nums, target, index+1);
    }

}
