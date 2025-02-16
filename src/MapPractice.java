/*
 * Problem 1:
Task: Given a list of strings, convert each string to its length.

Input Example: List<String> words = Arrays.asList("apple", "banana", "cherry");

Expected Output: [5, 6, 6]

Problem 2:
Task: Given a list of integers, square each integer.

Input Example: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

Expected Output: [1, 4, 9, 16, 25]

Problem 3:
Task: Given a list of employees, extract their names.

Input Example: List<Employee> employees = Arrays.asList(new Employee("John"), new Employee("Jane"), new Employee("Mark"));

Expected Output: ["John", "Jane", "Mark"]
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractice {
    public static class Employee{

        public String name;
        public int age;
        Employee(String s, int age){
            this.age = age;
            this.name = s;
        }

        public String toString(){
            return "NAME :"+this.name+" AGE:"+this.age;
        }
    }
    public static void main(String[] args) {
        //1
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lister = words.stream()
                                .map(s -> s.length())
                                .collect(Collectors.toList());
        lister.stream().forEach(System.out::println);
        //2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(n -> n*n).collect(Collectors.toList()).forEach(System.out::println);
        //3
        List<Employee> employees = Arrays.asList(new Employee("John",20), new Employee("Jane",30), new Employee("Mark",23));
        List<String> names = employees.stream().map( e -> e.name).collect(Collectors.toList());
        names.stream().forEach(s->System.out.println(s));
        
    }
}
