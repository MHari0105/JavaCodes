package serialization_and_deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

  public static void main(String[] args) {
    Student student1 = new Student();
    student1.rollNo = "20CS062";
    student1.name = "Hari";

    try {
      FileOutputStream fileOut = new FileOutputStream(
          "C:\\Users\\HariPrasathMurugaraj\\Documents\\my-work\\JavaCodes\\Java_Others\\src\\serialization_and_deserialization\\StudentData.txt"
      );
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(student1);
      out.close();
      fileOut.close();
      System.out.println("Serialized Data Saved");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
