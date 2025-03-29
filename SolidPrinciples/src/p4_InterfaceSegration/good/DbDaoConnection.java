package p4_InterfaceSegration.good;

//Implemented method what is actual being operated by this.
//We don't had to bother about file operation as interface segregated.

public class DbDaoConnection implements DbInterface, DaoInterface {

  @Override
  public void createRecord() {

  }

  @Override
  public void deleteRecord() {

  }

  @Override
  public void openConnection() {

  }

}
