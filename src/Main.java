// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee(1, "Alice", 50000.00);
        Employee emp2 = new Employee(2, "Bob", 60000.00);
        Employee emp3 = new Employee(3, "Charlie", 70000.00);

        // Store Employee objects in a List
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Display employee details
        for (Employee emp : employeeList) {
            emp.displayDetails();
            System.out.println(); // Line break for readability
        }
    }
}
