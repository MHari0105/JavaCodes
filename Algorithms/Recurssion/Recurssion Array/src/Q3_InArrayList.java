
import java.util.ArrayList;

public class Q3_InArrayList {
    public static void main(String[] args) {
        int[] arr = {23, 6, 31, 89, 31, 45};
//        findAllIndexes(arr, 31, 0);
//        System.out.println(list);

        ArrayList<Integer> ansList = findFromList(arr, 31, 0, new ArrayList<>());
        System.out.println(ansList);
    }



    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndexes(int[] nums, int target, int index) {
        if (index == nums.length)
            return;
        if (nums[index] == target)
            list.add(index);
        findAllIndexes(nums, target, index+1);
    }



    static ArrayList<Integer> findFromList(int[] nums, int target, int index, ArrayList<Integer> list) {
        if (index == nums.length)
            return list;
        if (nums[index] == target)
            list.add(index);
        return findFromList(nums, target, index+1, list);
    }



    // MAXIMUM AVOID USING THE APPROACH SINCE THE LIST IS GETTING CREATED AGAIN AND AGAIN
    static ArrayList<Integer> listInsideBody(int[] nums, int target, int index) {
        ArrayList<Integer> arrList = new ArrayList<>();

        if (index == nums.length)
            return list;
        if (nums[index] == target)
            arrList.add(index);

        ArrayList<Integer> ansArrList = listInsideBody(nums, target, index+1);
        arrList.addAll(ansArrList);

        return arrList;
    }


}
