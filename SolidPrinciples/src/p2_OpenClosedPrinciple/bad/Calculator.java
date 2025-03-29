package p2_OpenClosedPrinciple.bad;

// The bad design where we are taking type
// And for each type we have cases.
// Now if we want to introduce new operation, then the code needs to be modified
// Which is a wrong doing

public class Calculator {

  public int calculateNumber(int number1, int number2, String type) {
    int result = 0;
    switch (type) {
      case "Add":
        result = number1 + number2;
      case "Subtract":
        result = number1 - number2;
    }
    return result;
  }

}
