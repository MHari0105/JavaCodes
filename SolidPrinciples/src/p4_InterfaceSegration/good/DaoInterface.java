package p4_InterfaceSegration.good;

//This is good we will only include the dao operation
// And segregate connection part so consumer can implement required interfaces.

public interface DaoInterface {
  void createRecord();
  void deleteRecord();
}
