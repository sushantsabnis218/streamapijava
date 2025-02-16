/*
 * Task: Given a list of integers, sort them in ascending order.

Input Example: List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

Expected Output: [1, 2, 3, 5, 8]

Problem 2:
Task: Given a list of strings, sort them in alphabetical order.

Input Example: List<String> words = Arrays.asList("banana", "apple", "cherry");

Expected Output: ["apple", "banana", "cherry"]

Problem 3:
Task: Given a list of employees, sort them by age in descending order.

Input Example: List<Employee> employees = Arrays.asList(new Employee("John", 28), new Employee("Jane", 34), new Employee("Mark", 45));

Expected Output: [Employee{name='Mark', age=45}, Employee{name='Jane', age=34}, Employee{name='John', age=28}]
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        numbers.stream().sorted().collect(Collectors.toList()).forEach(s -> System.out.println(s));
        List<String> words = Arrays.asList("banana", "apple", "cherry");
        words.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
