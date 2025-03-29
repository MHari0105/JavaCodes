package p4_InterfaceSegration.bad;

public class FileDaoConnection implements DaoInterface {

  @Override
  public void openConnection() {
    //We can't open connection in file system
    throw new UnsupportedOperationException("Open Database connection is Not supported");
  }

  @Override
  public void createRecord() {

  }

  @Override
  public void openFile() {

  }

  @Override
  public void deleteRecord() {

  }

}
