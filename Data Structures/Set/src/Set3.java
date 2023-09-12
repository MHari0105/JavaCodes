import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.print("List : ");
        System.out.println(list);

        Set<Integer> set3 = new HashSet<>();
        set3.addAll(list);
        System.out.print("Set : ");
        System.out.println(set3);

        // ANOTHER METHOD
        Set<Integer> set3Alt = new HashSet<>(list);
        System.out.print("Alt Method : ");
        System.out.println(set3Alt);
    }
}
