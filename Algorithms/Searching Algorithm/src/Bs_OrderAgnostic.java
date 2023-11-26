
// SEARCH FOR ANY SORTED ORDER (ASC / DESC)

public class Bs_OrderAgnostic {
    public static void main(String[] args) {

        int[] arr = {-18, -10, -4, 0, 2, 4, 16, 23, 54};
        int target = 23;
        int targetIndex = orderAgnostic(arr, target);
        System.out.println(targetIndex);
    }

    private static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target)
                return middle;

            if (isAsc) {
                if (target < arr[middle])
                    end = middle -1 ;
                else start = middle + 1;
            }
            else {
                if (target > arr[middle])
                    end = middle - 1;
                else start = middle + 1;
            }
        }

        return -1;
    }
}
