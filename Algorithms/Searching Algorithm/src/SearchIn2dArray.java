
import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println("Maximum Value : " + findMax(arr));
        int target = 37;
        System.out.println("Target Index : " + Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[] {row, col};
            }
        }
        return new int[] {-1};
    }

    static int findMax(int[][] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int[] intArr : arr) {
            for (int element : intArr) {
                if (element > maxValue)
                    maxValue = element;
            }
        }
        return maxValue;
    }

}
