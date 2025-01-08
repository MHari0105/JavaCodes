package lambda_expressions.p4_consumer_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    char gender;

    Employee(String name, int salary, char gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

}

public class Demo2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("David", 50000, 'm'));
        list.add(new Employee("John", 30000, 'm'));
        list.add(new Employee("Mary", 40000, 'f'));
        list.add(new Employee("Scott", 60000, 'm'));

        // Bonus of an employee is 10% of his/her salary
        // Check if the bonus is greater than 5000
        // If the bonus of an employee is greater than 5k, print the employee details

        Function<Employee, Integer> fn = e -> (e.salary * 10) / 100;
        Predicate<Integer> p = bonus -> bonus >= 5000;
        Consumer<Employee> c = e -> {
            System.out.println(e.name);
            System.out.println(e.salary);
            System.out.println(e.gender);
        };

        for (Employee emp : list) {
            int bonus = fn.apply(emp);
            if (p.test(bonus)) {
                c.accept(emp);
                System.out.println("Employee bonus : " + bonus);
            }
        }
    }

}
