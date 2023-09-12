
public class Search1 {
    public static void main(String[] args) {

        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int value = 45;

        boolean isPresent = returnElement(nums, value);
        System.out.println("Element : " + isPresent);

        int index = returnIndex(nums, value);
        System.out.println("Index value : " + index);

    }

    // return the index value
    static int returnIndex(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int i=0; i<arr.length; i++) {
            int element = arr[i];
            if (element == target)
                return i;
        }
        return -1;
    }

    static boolean returnElement(int[] arr, int target) {
        if (arr.length == 0)
            return false;
        for (int element : arr) {
            if (element == target)
                return true;
        }
        return false;
    }
}

/* TIME COMPLEXITY
    Best Case - O(1),
    Worst Case - O(n), n -> size of the array
*/
