package Task2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestResuleGenerator {
    public static HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {
        return studentSet.stream()
                .filter(student ->  student.getMarks() < 85)
                .map(student-> student.getFname()+"_"+student.getGuardianContact())
                .collect(Collectors.toCollection(HashSet::new));
                
    }

    public static Set<Student> sortStudentsForRanking(HashSet<Student>studentSet) {        
        return studentSet.stream()
                .sorted(Comparator.comparingDouble(Student::getMarks).reversed().thenComparing(Student::getMarks))
                .peek(System.out::println)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
