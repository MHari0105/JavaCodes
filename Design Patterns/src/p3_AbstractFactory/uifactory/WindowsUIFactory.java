package p3_AbstractFactory.uifactory;

import p3_AbstractFactory.Button;
import p3_AbstractFactory.CheckBox;
import p3_AbstractFactory.os.windows.WindowsButton;
import p3_AbstractFactory.os.windows.WindowsCheckbox;

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
