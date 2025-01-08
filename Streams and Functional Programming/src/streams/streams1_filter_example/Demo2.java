package streams.streams1_filter_example;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

public class Demo2 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP", 75000));
        productList.add(new Product(2, "Dell", 70000));
        productList.add(new Product(3, "Acer", 85000));
        productList.add(new Product(4, "Lenovo", 60000));
        productList.add(new Product(5, "Asus", 80000));

        productList.stream()
                .filter(p -> p.price > 70000)
                .forEach(product -> System.out.println(product.name + " : Rs." + product.price + "/-"));

    }
}
