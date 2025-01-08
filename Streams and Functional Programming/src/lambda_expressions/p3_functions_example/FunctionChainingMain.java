package lambda_expressions.p3_functions_example;

/*
* Function Chaining - To chain 2 functions
* methods used - applyThen(), compose()
 */

import java.util.function.Function;

public class FunctionChainingMain {
    public static void main(String[] args) {

        Function<Integer, Integer> f1 = n -> n * 2;
        Function<Integer, Integer> f2 = n -> n * n;

        int ans1 = f1.andThen(f2).apply(5);         // First 5 is passed to f1(5*2) -> 10 and then,
        System.out.println(ans1);                      // The value is passed to f2(10*10) -> 100

        int ans2 = f1.compose(f2).apply(5);         // Here first the 5 is passed to f2(5*5) -> 25
        System.out.println(ans2);                      // And passed back to f1(25*2) -> 50

    }
}
