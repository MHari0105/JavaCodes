import java.util.HashSet;
import java.util.Set;

public class Set1 {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Jesse");
        names.add("Mike");
        names.add("Saul");
        names.add("Walter");

        // DOESN'T HAVE AN ORDER, PRINTS THE ELEMENTS IN RANDOM ORDER
        System.out.println(names);
        System.out.println("Set Size : " + names.size());

        names.remove("Walter");
        System.out.println(names);

        names.remove(0);    // CHECKS FOR THE ELEMENT WHETHER PRESENTS IN THE SET AND TRIES TO REMOVE IF NOT PRESENT, NO OPERATIONS DONE

        System.out.println(names.contains("Saul"));     // RETURNS BOOLEAN RESULT
        System.out.println(names.contains("Gus"));

        names.add("Grey Matter");
        System.out.println(names);

        names.clear();      // CLEARS THE ENTIRE SET
        System.out.println(names);


    }
}