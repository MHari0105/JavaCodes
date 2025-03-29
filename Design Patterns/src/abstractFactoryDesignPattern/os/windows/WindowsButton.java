package abstractFactoryDesignPattern.os.windows;

import abstractFactoryDesignPattern.Button;

public class WindowsButton implements Button {

  @Override
  public void select() {
    System.out.println("Windows Button");
  }

}
