package p3_AbstractFactory.os.mac;

import p3_AbstractFactory.CheckBox;

public class MacCheckBox implements CheckBox {

  @Override
  public void select() {
    System.out.println("Mac Checkbox");
  }

}
