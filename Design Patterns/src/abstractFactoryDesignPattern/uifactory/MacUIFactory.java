package abstractFactoryDesignPattern.uifactory;

import abstractFactoryDesignPattern.Button;
import abstractFactoryDesignPattern.CheckBox;
import abstractFactoryDesignPattern.os.mac.MacButton;
import abstractFactoryDesignPattern.os.mac.MacCheckBox;

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
