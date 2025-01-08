package streams.streams2_map_example;

import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

public class FilterMapDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Alex", 15000),
                new Employee(102, "Brain", 12500),
                new Employee(103, "Charles", 20000),
                new Employee(104, "David", 12000),
                new Employee(105, "Edward", 17500)
        );

        employeeList.stream()
                .filter(e -> e.salary < 15000)
                .map(eSal -> eSal.salary + 500)
                .forEach(emp -> System.out.println(emp));

    }
}
