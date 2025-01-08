package lambda_expressions.p1_demo;

@FunctionalInterface
interface Cab {
    String bookCab(String source, String destination);
}

//class Ola implements Cab {
//    public void bookCab() {
//        System.out.println("Ola cab booked");
//    }
//}

public class Main {
    public static void main(String[] args) {

//        Cab cab = new Ola();
        Cab cab = (s, d) -> {
            System.out.println("Ola Cab searching from " + s + " to " + d);
            return "Cab booked";
        };
        cab.bookCab("Vellalore", "Gandhipuram");
    }
}
