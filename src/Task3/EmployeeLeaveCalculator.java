package Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeLeaveCalculator {
    public static List<Short> getDefaulterEmployeeIDList(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(EmployeeLeaveCalculator::isDefaulter)
                .map(EmployeeLeaveCalculator::reduceBy1Per)
                .peek(System.out::println)
                .map(Employee::getEmployeeId)
                .collect(Collectors.toList());
    }

    public static ArrayList<String> getNumberOfLeaves(List<Employee> employeeList){
            return employeeList.stream()
                    .sorted(Comparator.comparingDouble(Employee::getLeavesTaken).reversed().thenComparing(Employee::getEmployeeName))
                    .map(emp -> new String(emp.getEmployeeName()+"-"+emp.getLeavesTaken()))
                    .collect(Collectors.toCollection(ArrayList::new));
    }

    private static Employee reduceBy1Per(Employee employee){
        double newSalary = employee.getSalary() * 0.99; // Reduce salary by 1%
        employee.setSalary(newSalary);
        return employee;
    }

    private static boolean isDefaulter(Employee e){
        return e.getLeavesTaken() > 3;
    }
}
