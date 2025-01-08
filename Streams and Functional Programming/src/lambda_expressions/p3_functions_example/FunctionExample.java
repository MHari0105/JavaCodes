package lambda_expressions.p3_functions_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
* Function<Argument Type, Return Type>
* It returns a value
* The method used here is fn.apply()
 */

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> fn1 = i -> i.length();
        System.out.println(fn1.apply("Hello"));

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("David", 50000));
        empList.add(new Employee("John", 30000));
        empList.add(new Employee("Marry", 20000));

        Function<Employee, Integer> fn2 = e -> {
            int salary = e.salary;
            if (salary > 10000 && salary <= 20000)
                return (salary * 10/100);
            else if (salary > 20000 && salary <= 30000)
                return (salary * 20/100);
            else if (salary > 30000 && salary <= 50000)
                return (salary * 30/100);
            else return (salary * 50/100);
        };

        Predicate<Integer> p1 = b -> (b > 5000);

        for (Employee e : empList) {
            int bonus = fn2.apply(e);
            if (p1.test(bonus)) {
                System.out.println(e.name + " " + e.salary);
                System.out.println("Bonus : " + bonus);
            }
        }
    }

}
