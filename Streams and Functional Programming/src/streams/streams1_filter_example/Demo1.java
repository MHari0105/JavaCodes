package streams.streams1_filter_example;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(5, 10, 15, 20, 25, 30);
        List<Integer> evenNumbersList;

        System.out.println("Print in another collection");
        evenNumbersList = myList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumbersList);

        System.out.println("print as such");
        myList.stream()
                .filter(n -> n % 3 == 0)                    // Predicate<T>
                .forEach(num -> System.out.println(num));   // Consumer<T>

        System.out.println("Same output with better approach");
        myList.stream().filter(n -> n%3 == 0).forEach(System.out::println);
    }

}
