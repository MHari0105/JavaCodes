package p3_AbstractFactory.os.mac;

import p3_AbstractFactory.Button;

public class MacButton implements Button {

  @Override
  public void select() {
    System.out.println("Mac Button");
  }

}
