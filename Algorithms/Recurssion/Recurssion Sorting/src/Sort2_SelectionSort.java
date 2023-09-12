package Recursion_Sorting;

import java.util.Arrays;

public class Sort2_SelectionSort {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        selectionSort(nums, 0, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] arr, int max, int index, int last) {
        if (last == 0)
            return;

        if (index < last) {
            if (arr[index] >= arr[last]) {
                max = arr[index];
                int temp = arr[last];
                arr[last] = max;
                arr[index] = temp;
            }
            selectionSort(arr, max, index+1, last);
        }
        selectionSort(arr, max, 0, last-1);
    }

}
