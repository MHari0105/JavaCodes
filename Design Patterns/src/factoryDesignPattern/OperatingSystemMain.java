package factoryDesignPattern;

import factoryDesignPattern.factory.OperatingSystem;

public class OperatingSystemMain {

  public static void main(String[] args) {

    OperatingSystem os1 = OperatingSystemFactory.getInstance("WINDOWS" , "WIN7" ,"x64");
    System.out.println(os1.getVersion());
    System.out.println(os1.getArchitecture());

  }

}
