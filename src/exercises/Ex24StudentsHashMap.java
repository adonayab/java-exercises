package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex24StudentsHashMap {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    HashMap<Integer, String> students = new HashMap<>();
    String newStudent = " ";

    System.out.println("Enter your students (or ENTER to finish): ");

    do {
      System.out.println("Student: ");
      newStudent = in.nextLine();
      if (!newStudent.equals("")) {
        System.out.println("ID of " + newStudent + " : ");
        int id = in.nextInt();
        students.put(id, newStudent);
        in.nextLine();
      }
    } while (!newStudent.equals(""));

    System.out.println("ID - Name");
    System.out.println("---------");
    for (Map.Entry<Integer, String> student: students.entrySet()) {
      System.out.println(student.getKey() + "  - " + student.getValue());
    }
    
  }
}
