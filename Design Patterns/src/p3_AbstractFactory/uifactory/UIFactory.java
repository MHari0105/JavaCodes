package p3_AbstractFactory.uifactory;

import p3_AbstractFactory.Button;
import p3_AbstractFactory.CheckBox;

public interface UIFactory {
  Button createButton();
  CheckBox createCheckBox();
}
