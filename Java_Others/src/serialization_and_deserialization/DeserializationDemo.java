package serialization_and_deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    Student student1 = null;

    try {
      FileInputStream fileIn = new FileInputStream(
          "C:\\Users\\HariPrasathMurugaraj\\Documents\\my-work\\JavaCodes\\Java_Others\\src\\serialization_and_deserialization\\StudentData.txt"
      );
      ObjectInputStream in = new ObjectInputStream(fileIn);
      student1 = (Student) in.readObject();
      in.close();
      fileIn.close();
    }
    finally {
      System.out.println("Deserializing Student Data...");
      System.out.println("Student Roll No : " + student1.rollNo);
      System.out.println("Student Name : " + student1.name);
    }
  }

}
