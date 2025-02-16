/*
 * flatMap()
Problem 1:
Task: Given a list of lists of characters, flatten it into a single list.

Input Example: List<List<Character>> charLists = Arrays.asList(Arrays.asList('a', 'b', 'c'), Arrays.asList('d', 'e', 'f'));

Expected Output: [a, b, c, d, e, f]

Problem 2:
Task: Given a list of sentences, split each sentence into words and flatten the list of words.

Input Example: List<String> sentences = Arrays.asList("Hello world", "Java streams are powerful");

Expected Output: ["Hello", "world", "Java", "streams", "are", "powerful"]

Problem 3:
Task: Given a list of students with lists of their grades, flatten the list of grades.

Input Example: List<Student> students = Arrays.asList(new Student("John", Arrays.asList(90, 85)), new Student("Jane", Arrays.asList(95, 80)));

Expected Output: [90, 85, 95, 80]
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapPractice {
    public static class Student{
        public String name;
        public List<Integer> grades;
        Student(String name, List<Integer> grades){
            this.name = name;
            this.grades = grades;
        }
    }
    public static void main(String[] args) {
        //1
        List<List<Character>> charLists = Arrays.asList(Arrays.asList('a', 'b', 'c'), Arrays.asList('d', 'e', 'f'));
        charLists.stream()
        .flatMap(list -> list.stream())
        .forEach(System.out::println);
        //2
        List<String> sentences = Arrays.asList("Hello world", "Java streams are powerful");
        sentences.stream()
        .flatMap(s -> Stream.of(s.split(" ")))
        .collect(Collectors.toList())
        .forEach(System.out::println);
        //3
        List<Student> students = Arrays.asList(new Student("John", Arrays.asList(90, 85)), new Student("Jane", Arrays.asList(95, 80)));
        students.stream()
            .flatMap(s -> s.grades.stream())
            .collect(Collectors.toList())
            .forEach(j -> System.out.println(j));
    }

}
