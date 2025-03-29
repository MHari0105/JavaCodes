package abstractFactoryDesignPattern.os.mac;

import abstractFactoryDesignPattern.Button;

public class MacButton implements Button {

  @Override
  public void select() {
    System.out.println("Mac Button");
  }

}
