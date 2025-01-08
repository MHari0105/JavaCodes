package functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeDeclarativeExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Abi", Gender.FEMALE),
                new Person("Aisu", Gender.FEMALE),
                new Person("Buvani", Gender.FEMALE),
                new Person("Benz", Gender.MALE),
                new Person("Hari", Gender.MALE)
        );

        //  IMPERATIVE APPROACH
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender))
                females.add(person);
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // DECLARATIVE APPROACH
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "name = '" + name + '\'' +
                    ", gender = " + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}
