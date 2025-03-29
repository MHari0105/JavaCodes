package factoryDesignPattern.factory;

public class WindowsOS extends OperatingSystem {

  public WindowsOS(String version, String architecture) {
    super(version, architecture);
  }

  @Override
  public void changeDirectory(String directory) {

  }

  @Override
  public void removeDirectory(String directory) {

  }

}
