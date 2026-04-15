import java.util.ArrayList;
import java.util.List;

/**
 * Main class demonstrating the use of generic Repository and Result classes.
 * Tests simple type (String) and complex type (Employee).
 */
public class Main {
    /**
     * Main method to execute the demonstration.
     * Part A: Creates and tests String repository with guest names.
     * Part B: Creates and tests Employee repository, retrieves and specified
     * employee, and wraps it in Result object for displaying.
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Part A: Guest Names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Repository<String> guestNames = new Repository<String>(names);
        System.out.println("Number of guests: " + guestNames.size());

        System.out.println(); // add space to differentiate parts

        // Part B: Employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("Milk Smith", "C456", 5000, 1000));
        employees.add(new HourlyEmployee("Love Madriaga", "D789", 15, 550));
        
        Repository<Employee> empRepo = new Repository<>(employees);
        Employee emp = empRepo.get(1);

        Result<Employee> result = new Result<Employee>(emp, "Load Successful", true);
        result.display();
    }
}
