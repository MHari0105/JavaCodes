package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.uifactory.MacUIFactory;
import abstractFactoryDesignPattern.uifactory.WindowsUIFactory;

public class Main {

  public static void main(String[] args) {

    Application windowsApp = new Application(new WindowsUIFactory());
    windowsApp.select();

    System.out.println("=====");

    Application macApp = new Application(new MacUIFactory());
    macApp.select();

  }

}
