package Task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student((byte) 1, "Alice", "Smith", (byte) 3);
        Student student2 = new Student((byte) 2, "Bob", "Johnson", (byte) 2);
        Student student3 = new Student((byte) 3, "Charlie", "Brown", (byte) 1);
        Student student4 = new Student((byte) 4, "Daisy", "Wi lliams", (byte) 4);
        Student student5 = new Student((byte) 5, "Ethan", "Jones", (byte) 3);
        Student student6 = new Student((byte) 6, "Fiona", "Garcia", (byte) 2);
        Student student7 = new Student((byte) 7, "George", "Martinez", (byte) 1);
        Student student8 = new Student((byte) 8, "Hannah", "Davis", (byte) 4);
        Student student9 = new Student((byte) 9, "Ian", "Wilson", (byte) 3);
        Student student10 = new Student((byte) 10, "Julia", "Moore", (byte) 2);
        
        List<Student> students = Stream.of(student1, student2, student3, 
                                            student4, student5, student6, 
                                            student7, student8, student9,student10)
                                        .collect(Collectors.toList());
        System.out.println(PortalCredentialsCreator.createListOfRandomPasswords(students));
    }
}
