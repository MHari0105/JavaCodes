package lambda_expressions.p5_supplier_eample;

import java.util.Date;
import java.util.function.Supplier;

/*
* supplier -> Doesn't take any input but return a value
* Supplier<ReturnType> s = lambda expression;
* method -> get()
 */
public class Demo1 {
    public static void main(String[] args) {

        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());

    }
}
