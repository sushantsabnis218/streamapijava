/*
 * distinct()
Problem 1:
Task: Given a list of integers with duplicates, remove the duplicates.

Input Example: List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

Expected Output: [1, 2, 3, 4, 5]

Problem 2:
Task: Given a list of strings with duplicates, remove the duplicates.

Input Example: List<String> words = Arrays.asList("apple", "banana", "apple", "cherry");

Expected Output: ["apple", "banana", "cherry"]

Problem 3:
Task: Given a list of employees with duplicate names, remove employees with duplicate names.

Input Example: List<Employee> employees = Arrays.asList(new Employee("John"), new Employee("Jane"), new Employee("John"));
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethodPractice {
    public static class Employee{
        public String name;
        Employee(String s){
            this.name = s;
        }
        public String toString(){
            return this.name;
        }
    }
    public static void main(String[] args) {
        //1
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        numbers.stream()
        .distinct()
        .collect(Collectors.toList())
        .forEach(System.out::println);
        //2
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry");
        words.stream()
        .distinct()
        .collect(Collectors.toList())
        .forEach(System.out::println);
        //3
        List<Employee> employees = Arrays.asList(new Employee("John"), new Employee("Jane"), new Employee("John"));
        employees.stream()
        .distinct()
        .collect(Collectors.toList())
        .forEach(System.out::println);
    }
    
}
