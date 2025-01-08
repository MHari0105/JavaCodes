package lambda_expressions.p2_predicate_example;

/*
* Predicate is used to have conditional checks in a program
* Predicate<T> p = lambda expression with conditional checks; p.test(lambda);
* It takes only one parameter and returns boolean type
 */

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {

        Predicate<Integer> p1 = i -> (i > 10);
        boolean check1 = p1.test(15);
        System.out.println(check1);

        Predicate<String> p2 = i -> (i.length() > 4);
        boolean check2 = p2.test("MyLength");
        System.out.println(check2);
    }
}
