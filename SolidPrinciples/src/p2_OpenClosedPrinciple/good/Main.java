package p2_OpenClosedPrinciple.good;

public class Main {

  public static void main(String[] args) {

    Calculator calculator = new Calculator();
    Operations addOperation = new AddOperation();
    Operations subtractOperation = new SubtractOperation();

    int addition = calculator.calculateNumber(10, 20, addOperation);
    int subtraction = calculator.calculateNumber(30, 12, subtractOperation);

    System.out.println(addition);
    System.out.println(subtraction);
  }

}
