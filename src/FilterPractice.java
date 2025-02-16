/*
 * 
Task: Given a list of integers, filter out all the prime numbers.

Input Example: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

Expected Output: [2, 3, 5, 7]

Problem 2:
Task: Given a list of strings, filter out strings that have a length greater than 3.

Input Example: List<String> words = Arrays.asList("cat", "dog", "elephant", "fox", "lion");

Expected Output: ["cat", "dog", "fox", "lion"]

Problem 3:
Task: Given a list of employees with ages, filter out employees who are younger than 30.

Input Example: List<Employee> employees = Arrays.asList(new Employee("John", 28), new Employee("Jane", 34), new Employee("Mark", 45));

Expected Output: [Employee{name='Jane', age=34}, Employee{name='Mark', age=45}]
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPractice {
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
    public static boolean isPrime(int num){
        if(num == 1)
            return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
        .filter(num -> isPrime(num))
        .collect(Collectors.toList())
        .forEach(num->System.out.println(num));
        //2
        List<String> words = Arrays.asList("cat", "dog", "elephant", "fox", "lion");
        words.stream()
        .filter(s -> s.length() > 3)
        .collect(Collectors.toList())
        .forEach(s -> System.out.println(s));
        //3
        List<Employee> employees = Arrays.asList(new Employee("John", 28), new Employee("Jane", 34), new Employee("Mark", 45));
        employees.stream()
            .filter( employee -> employee.age > 30)
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}
