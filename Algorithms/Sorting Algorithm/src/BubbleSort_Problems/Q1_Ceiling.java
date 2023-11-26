package BubbleSort_Problems;

//    RETURN IF THE TARGET IS FOUND INSIDE THE ARRAY, ELSE RETURN THE NEXT ELEMENT GREATER THAN THE TARGET ELEMENT

public class Q1_Ceiling {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 10, 14, 17, 23, 45, 53};
        int target = 23;
        System.out.println(ceilingNumberIterative(arr, target));
        ceilingNumberRecursive(arr, target, 0, arr.length);
    }

    static void ceilingNumberRecursive(int[] arr, int target, int start, int end) {
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            System.out.println(mid);
            return;
        }

        if (arr[mid] > target) {
            if (arr[mid-1] < target) {
                System.out.println(mid);
                return;
            }
            else ceilingNumberRecursive(arr, target, start, mid);
        }
        else ceilingNumberRecursive(arr, target, mid, end);
    }


    static int ceilingNumberIterative(int[] arr, int target) {
        if (arr[0] > target || arr[arr.length-1] < target)
            return -1;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target || (arr[i] > target && arr[i-1] < target))
                return i;
        }
        return -1;
    }

}
