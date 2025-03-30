package p3_AbstractFactory.uifactory;

import p3_AbstractFactory.Button;
import p3_AbstractFactory.CheckBox;
import p3_AbstractFactory.os.mac.MacButton;
import p3_AbstractFactory.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {

  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }

}
