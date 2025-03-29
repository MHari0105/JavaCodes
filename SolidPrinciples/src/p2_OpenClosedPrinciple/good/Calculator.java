package p2_OpenClosedPrinciple.good;

public class Calculator {

  public int calculateNumber(int num1, int num2, Operations operation) {
    return operation.perform(num1, num2);
  }

}
