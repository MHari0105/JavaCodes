package Recursion_Sorting;

import java.util.Arrays;

public class Sort1_BubbleSort {
    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 1};
        bubbleSort(nums, nums.length-1, 0);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums, int i, int j) {
        if (i == 0)
            return;

        if (j < i) {
            if (nums[j] > nums[j+1]) {
                int temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
            }
            bubbleSort(nums, i, j+1);
        }

        else bubbleSort(nums, i-1, 0);
    }
}
