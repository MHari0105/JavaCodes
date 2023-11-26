
public class RoughDraft {
    public static void main(String[] args) {

        int[] arr = {12, 34, 56, 78, 90, 98, 76};
        int target = 12;

        int peak = findPeak(arr);

        int targetIndex = findByPeak(arr, target, peak);
        System.out.println(targetIndex);
    }

    private static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < arr[middle+1])
                start = middle + 1;
            else end = middle - 1;
        }

        return start;
    }

    private static int findByPeak(int[] arr, int target, int peak) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = target < arr[peak];

        while (start < end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target)
                return middle;

            if (isAsc) {
                if (arr[middle] < target)
                    start = middle + 1;
                else end = middle - 1;
            }
            else {
                if (arr[middle] > target)
                    start = middle + 1;
                else end = middle - 1;
            }
        }

        return -1;
    }
}
