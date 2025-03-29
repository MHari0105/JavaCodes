import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RoughDraft {
    public static void main(String[] args) {

//        int[] arr = {-1, 0, 1, 2, -1, -4};
//        List<List<Integer>> solution = threeSum(arr);
//        System.out.println(solution);

        int[] arr2 = {1, 2, 3, 4, 5};
        Node ans = linkedList(arr2);

    }

    private static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> solutionSet = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            List<Integer> singleList = new ArrayList<>();
            for (int j = i + 1; j < arr.length - 1; j++) {
                int k = - (arr[i] + arr[j]);
                if (singleList.contains(k)) {
                    List<Integer> list = Arrays.asList(arr[i], arr[j], k);
                    solutionSet.add(list);
                }
                singleList.add(arr[j]);
            }
            solutionSet.add(singleList);
        }

        return new ArrayList<>(solutionSet);
    }

    private static Node linkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        StringBuilder sb1 = new StringBuilder();
        for (int i = 1; i <arr.length; i++) {
            sb1.append(temp.data);
            sb1.append(" -> ");
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        sb1.append(temp.data);
        System.out.println(sb1);
        return head;
    }

}
