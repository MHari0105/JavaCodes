package extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
  int rollNo;
  String name;

  Student(int rollNo, String name) {
    this.rollNo = rollNo;
    this.name = name;
  }

  public String toString() {
    return rollNo + " : " + name;
  }

}

class SortByRollNo implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.rollNo - o2.rollNo;
  }

  @Override
  public boolean equals(Object obj) {
    return false;
  }

}

public class ComparatorExample {
  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();

    students.add(new Student(111, "Mayank"));
    students.add(new Student(131, "Anshul"));
    students.add(new Student(121, "Solanki"));
    students.add(new Student(101, "Aggarwal"));

    students.sort(new SortByRollNo());

    System.out.println("Sorted students list");

    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i));
    }

  }
}
