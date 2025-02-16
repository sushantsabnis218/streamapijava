package Task3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee((short) 101, "Aditi Sharma", 75000.00, (byte) 2); // Indian
        Employee emp2 = new Employee((short) 102, "Bao Nguyen", 82000.00, (byte) 5); // Vietnamese
        Employee emp3 = new Employee((short) 103, "Carlos Ruiz", 68000.00, (byte) 1); // Spanish
        Employee emp4 = new Employee((short) 104, "Diana Wilson", 95000.00, (byte) 3); // Roman/English
        Employee emp5 = new Employee((short) 105, "Ethan Brown", 72000.00, (byte) 4); // English
        Employee emp6 = new Employee((short) 106, "Fatima Khalid", 88000.00, (byte) 2); // Arabic
        Employee emp7 = new Employee((short) 107, "Gustavo Mendes", 69000.00, (byte) 3); // Portuguese
        Employee emp8 = new Employee((short) 108, "Hiroshi Tanaka", 93000.00, (byte) 1); // Japanese
        Employee emp9 = new Employee((short) 109, "Ivana Petrova", 76000.00, (byte) 5); // Russian
        Employee emp10 = new Employee((short) 110, "Jin Woo", 87000.00, (byte) 2); // Korean
        Employee emp11 = new Employee((short) 111, "Karim El-Sayed", 82000.00, (byte) 4); // Arabic
        Employee emp12 = new Employee((short) 112, "Lina Gomez", 91000.00, (byte) 3); // Latin American/Spanish
        Employee emp13 = new Employee((short) 113, "Ming Li", 70000.00, (byte) 2); // Chinese
        Employee emp14 = new Employee((short) 114, "Nia Roberts", 94000.00, (byte) 1); // Welsh
        Employee emp15 = new Employee((short) 115, "Omar Hassan", 78000.00, (byte) 4); // Arabic
        Employee emp16 = new Employee((short) 116, "Priya Singh", 85000.00, (byte) 3); // Indian
        Employee emp17 = new Employee((short) 117, "Quynh Tran", 81000.00, (byte) 2); // Vietnamese
        Employee emp18 = new Employee((short) 118, "Rahul Patel", 89000.00, (byte) 5); // Indian
        Employee emp19 = new Employee((short) 119, "Sara Ahmed", 74000.00, (byte) 1); // Arabic
        Employee emp20 = new Employee((short) 120, "Tariq Abbas", 87000.00, (byte) 4); // Arabic

        List<Employee> employees = Stream.of(emp1 ,emp2 ,emp3 ,
                                    emp4 ,emp5 ,emp6 ,emp7 ,emp8 ,
                                    emp9 ,emp10,emp11,emp12,emp13,emp14,
                                    emp15,emp16,emp17,emp18,emp19,emp20).collect(Collectors.toList());

        // System.out.println(EmployeeLeaveCalculator.getDefaulterEmployeeIDList(employees));
        System.out.println(EmployeeLeaveCalculator.getNumberOfLeaves(employees));
    }
}
