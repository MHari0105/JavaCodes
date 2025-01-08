package streams.streams2_map_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("Bus", "Car", "Bike", "Aeroplane", "Train", "Ship");
        List<String> uppercaseNames;

        uppercaseNames = vehicles.stream()
                //.map(vehicle -> vehicle.toUpperCase())  :  Consumer<T>
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseNames);

        vehicles.stream()
                .map(name -> name.length())
                .forEach(System.out::println);
    }
}
