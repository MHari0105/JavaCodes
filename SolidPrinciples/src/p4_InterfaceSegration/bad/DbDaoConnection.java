package p4_InterfaceSegration.bad;

public class DbDaoConnection implements DaoInterface {

  @Override
  public void openConnection() {
    // Connection Logic
  }

  @Override
  public void createRecord() {
    // Create record logic
  }

  @Override
  public void openFile() {
    // We are in DB Connection so no need to support open file
    throw new UnsupportedOperationException("Open file Not supported");
  }

  @Override
  public void deleteRecord() {
    // This is fine
  }

}
