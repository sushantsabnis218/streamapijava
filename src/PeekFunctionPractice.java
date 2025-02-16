/*
 * Task: Given a list of integers, print each integer as it is processed and square each integer.

Input Example: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

Expected Output: [1, 4, 9, 16, 25] (with intermediate print statements showing the processing)

Problem 2:
Task: Given a list of strings, print each string as it is processed and convert it to lowercase.

Input Example: List<String> words = Arrays.asList("HELLO", "WORLD", "JAVA");

Expected Output: ["hello", "world", "java"] (with intermediate print statements showing the processing)

Problem 3:
Task: Given a list of employees, print each employee as they are processed and increase their age by 1.

Input Example: List<Employee> employees = Arrays.asList(new Employee("John", 28), new Employee("Jane", 34));

Expected Output: [Employee{name='John', age=29}, Employee{name='Jane', age=35}] (with intermediate print statements showing the processing)
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekFunctionPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sqared = numbers.stream().map(n -> n*n).peek(System.out::println).collect(Collectors.toList());
    }
}
