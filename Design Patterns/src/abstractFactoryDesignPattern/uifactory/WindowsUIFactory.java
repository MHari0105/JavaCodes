package abstractFactoryDesignPattern.uifactory;

import abstractFactoryDesignPattern.Button;
import abstractFactoryDesignPattern.CheckBox;
import abstractFactoryDesignPattern.os.windows.WindowsButton;
import abstractFactoryDesignPattern.os.windows.WindowsCheckbox;

public class WindowsUIFactory implements UIFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WindowsCheckbox();
  }

}
