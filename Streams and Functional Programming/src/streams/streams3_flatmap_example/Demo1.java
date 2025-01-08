package streams.streams3_flatmap_example;

/*
* map -> returns a single element
* flatMap() -> returns a stream of objects
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(5, 6);

        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        finalList.add(list1);
        finalList.add(list2);
        finalList.add(list3);

//        List<Integer> targetList = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        List<Integer> targetList = finalList.stream().flatMap(Collection::stream).toList();

        System.out.println(targetList);
    }
}
