package Task2;

import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student((byte) 1, "Arjun", "Sharma", 9876543210L, 85.5); // South Asian
        Student student2 = new Student((byte) 2, "Bella", "Nguyen", 8765432109L, 90.0); // Vietnamese
        Student student3 = new Student((byte) 3, "Carlos", "Fernandez", 7654321098L, 88.0); // Latin American
        Student student4 = new Student((byte) 4, "Deepa", "Kumar", 6543210987L, 92.5); // South Asian
        Student student5 = new Student((byte) 5, "Ethan", "Jones", 5432109876L, 85.5); // Western
        Student student6 = new Student((byte) 6, "Farah", "Ahmed", 4321098765L, 87.0); // Middle Eastern
        Student student7 = new Student((byte) 7, "George", "Martinez", 3210987654L, 85.5); // Latin American
        Student student8 = new Student((byte) 8, "Hina", "Davis", 2109876543L, 89.5); // Western
        Student student9 = new Student((byte) 9, "Isha", "Singh", 1098765432L, 82.0); // South Asian
        Student student10 = new Student((byte) 10, "Keanu", "Ngata", 987654321, 90.0); // Māori
        Student student11 = new Student((byte) 11, "Linda", "Kane", 1234567890, 88.0); // African
        Student student12 = new Student((byte) 12, "Nina", "Kristensen", 2345678901L, 91.0); // Nordic
        Student student13 = new Student((byte) 13, "Jorge", "Castillo", 3456789012L, 87.0); // Chilean
        Student student14 = new Student((byte) 14, "Zara", "Al-Sheikh", 4567890123L, 92.0); // Arabic
        Student student15 = new Student((byte) 15, "Lina", "Lopez", 5678901234L, 85.5); // Latin American
        Student student16 = new Student((byte) 16, "Haruto", "Yamamoto", 6789012345L, 84.0); // Japanese
        Student student17 = new Student((byte) 17, "Li", "Wang", 7890123456L, 89.0); // Chinese
        Student student18 = new Student((byte) 18, "Batbayar", "Altansukh", 8901234567L, 83.0); // Mongolian
        Student student19 = new Student((byte) 19, "Rohit", "Deshmukh", 9012345678L, 88.0); // Marathi
        Student student20 = new Student((byte) 20, "Megha", "Patel", 1234567891L, 87.5); // Gujarati

        HashSet<Student> studentsHashSet =Stream.of(student1, 
                                            student2 ,student3 ,student4 ,student5 ,student6 ,student7 ,student8 ,
                                            student9 ,student10,student11,student12,student13,
                                            student14,student15,student16,student17,student18,student19,student20)
                                        .collect(Collectors.toCollection(HashSet::new));

        System.out.println(TestResuleGenerator.sortStudentsForRanking(studentsHashSet));
    }
}
