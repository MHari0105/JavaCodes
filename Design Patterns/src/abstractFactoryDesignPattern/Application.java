package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.uifactory.UIFactory;

public class Application {

  private final Button button;
  private final CheckBox checkBox;

  public Application(UIFactory uiFactory) {
    button = uiFactory.createButton();
    checkBox = uiFactory.createCheckBox();
  }

  public void select() {
    button.select();
    checkBox.select();
  }

}
