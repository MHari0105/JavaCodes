package streams.streams2_map_example;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
  public static void main(String[] args) {
    List<StudentDetails> details = Arrays.asList(
        new StudentDetails(1, "Hari"),
        new StudentDetails(2, "Prad"),
        new StudentDetails(3, "Ash"),
        new StudentDetails(4, "Chan"),
        new StudentDetails(5, "Log")
    );

    List<Integer> studentsId = details.stream()
        .map(StudentDetails::getId)
        .toList();

    System.out.println(studentsId);
  }

}

class StudentDetails {
  int id;
  String name;

  StudentDetails(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}