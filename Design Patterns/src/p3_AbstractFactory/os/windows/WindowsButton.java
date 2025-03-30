package p3_AbstractFactory.os.windows;

import p3_AbstractFactory.Button;

public class WindowsButton implements Button {

  @Override
  public void select() {
    System.out.println("Windows Button");
  }

}
