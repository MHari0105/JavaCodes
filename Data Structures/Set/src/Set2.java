import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Set2 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Jon Snow");
        set.add("Danareyas");
        set.add("Tiriyon Lanister");
        set.add("Arya Stark");
        set.add("Night King");

        set.forEach(System.out::println);       // FOR EACH APPROACH

        System.out.println("========================================================");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
