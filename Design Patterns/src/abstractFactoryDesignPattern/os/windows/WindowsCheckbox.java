package abstractFactoryDesignPattern.os.windows;

import abstractFactoryDesignPattern.CheckBox;

public class WindowsCheckbox implements CheckBox {

  @Override
  public void select() {
    System.out.println("Windows Checkbox");
  }

}
