package abstractFactoryDesignPattern.uifactory;

import abstractFactoryDesignPattern.Button;
import abstractFactoryDesignPattern.CheckBox;

public interface UIFactory {
  Button createButton();
  CheckBox createCheckBox();
}
