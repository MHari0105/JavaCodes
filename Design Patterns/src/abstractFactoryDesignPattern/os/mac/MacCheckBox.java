package abstractFactoryDesignPattern.os.mac;

import abstractFactoryDesignPattern.CheckBox;

public class MacCheckBox implements CheckBox {

  @Override
  public void select() {
    System.out.println("Mac Checkbox");
  }

}
