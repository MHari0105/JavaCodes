package p3_AbstractFactory.os.windows;

import p3_AbstractFactory.CheckBox;

public class WindowsCheckbox implements CheckBox {

  @Override
  public void select() {
    System.out.println("Windows Checkbox");
  }

}
