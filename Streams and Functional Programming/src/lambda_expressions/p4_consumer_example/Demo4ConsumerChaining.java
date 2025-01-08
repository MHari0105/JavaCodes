package lambda_expressions.p4_consumer_example;

import java.util.function.Consumer;

public class Demo4ConsumerChaining {
    public static void main(String[] args) {

        Consumer<String> c1 = c -> System.out.println(c + " A5");
        Consumer<String> c2 = c -> System.out.println(c + " Q3");
        Consumer<String> c3 = c -> System.out.println(c + " R8");

        c1.andThen(c2).andThen(c3).accept("Audi");
    }
}
