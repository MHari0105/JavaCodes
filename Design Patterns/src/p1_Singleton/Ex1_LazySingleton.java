package p1_Singleton;

import java.io.Serializable;

public class Ex1_LazySingleton implements Serializable {

  private static Ex1_LazySingleton singleton = null;

  private Ex1_LazySingleton() {

  }

  public static Ex1_LazySingleton getInstance() {
    if (singleton == null)
      singleton = new Ex1_LazySingleton();
    return singleton;
  }

}
