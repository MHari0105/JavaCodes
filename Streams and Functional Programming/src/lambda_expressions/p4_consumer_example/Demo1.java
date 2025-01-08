package lambda_expressions.p4_consumer_example;

import java.util.function.Consumer;

/*
* Consumer -> get some value and perform operations, but doesn't return any value
* method used -> accept()
*/

public class Demo1 {
    public static void main(String[] args) {

        Consumer<String> c = s -> System.out.println(s);
        c.accept("HELLO");
    }
}
