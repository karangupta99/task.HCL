package assignment2;


import java.util.*;
import java.util.regex.Pattern;

// Interface
interface EmployeeOperations {
    void addEmployee();
    void displayEmployees();
    void searchEmployee(int id);
    void removeEmployee(int id);
}

// Employee Class
class Employee {
    int empId;
    String name;
    String email;

    Employee(int empId, String name, String email) {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }
}

// Main Class
public class EmployeeManagement implements EmployeeOperations {

    Scanner sc = new Scanner(System.in);

    // Maps
    HashMap<Integer, Employee> hashMap = new HashMap<>();
    Hashtable<Integer, Employee> hashtable = new Hashtable<>();
    TreeMap<Integer, Employee> treeMap = new TreeMap<>();

    // REGEX
    final String NAME_REGEX = "^[A-Za-z ]+$";
    final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

    public static void main(String[] args) {
        EmployeeManagement obj = new EmployeeManagement();
        obj.menu();
    }

    void menu() {
        while (true) {
            try {
                System.out.println("\n--- Employee Management Menu ---");
                System.out.println("1. Add Employee");
                System.out.println("2. Display Employees");
                System.out.println("3. Search Employee by ID");
                System.out.println("4. Remove Employee by ID");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        displayEmployees();
                        break;
                    case 3:
                        System.out.print("Enter Employee ID: ");
                        searchEmployee(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Enter Employee ID: ");
                        removeEmployee(sc.nextInt());
                        break;
                    case 5:
                        System.out.println("Program Exited");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (Exception e) {
                System.out.println("Invalid Input!");
                sc.nextLine();
            }
        }
    }

    // Add Employee
    public void addEmployee() {
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            if (!Pattern.matches(NAME_REGEX, name)) {
                System.out.println("Invalid Name");
                return;
            }

            if (!Pattern.matches(EMAIL_REGEX, email)) {
                System.out.println("Invalid Email");
                return;
            }

            Employee emp = new Employee(id, name, email);

            hashMap.put(id, emp);
            hashtable.put(id, emp);
            treeMap.put(id, emp);

            System.out.println("Employee Added Successfully");

        } catch (Exception e) {
            System.out.println("Error while adding employee");
        }
    }

    // Display Employees
    public void displayEmployees() {
        if (hashMap.isEmpty()) {
            System.out.println("No Records Found");
            return;
        }

        System.out.println("\n--- HashMap Data ---");
        for (Map.Entry<Integer, Employee> e : hashMap.entrySet()) {
            display(e.getValue());
        }

        System.out.println("\n--- Hashtable Data ---");
        for (Map.Entry<Integer, Employee> e : hashtable.entrySet()) {
            display(e.getValue());
        }

        System.out.println("\n--- TreeMap Data (Sorted) ---");
        for (Map.Entry<Integer, Employee> e : treeMap.entrySet()) {
            display(e.getValue());
        }

        // Null Demonstration
        System.out.println("\n--- Null Key & Value Demo ---");
        hashMap.put(null, null); // allowed
        System.out.println("HashMap allows null key & value");

        System.out.println("Hashtable does NOT allow null key or value");
    }

    // Search Employee
    public void searchEmployee(int id) {
        Employee emp = hashMap.get(id);
        if (emp != null) {
            System.out.println("Employee Found:");
            display(emp);
        } else {
            System.out.println("Employee Not Found");
        }
    }

    // Remove Employee
    public void removeEmployee(int id) {
        if (hashMap.containsKey(id)) {
            hashMap.remove(id);
            hashtable.remove(id);
            treeMap.remove(id);
            System.out.println("Employee Removed Successfully");
        } else {
            System.out.println("Employee Not Found");
        }
    }

    // Display Helper
    void display(Employee emp) {
        System.out.println("ID: " + emp.empId +
                ", Name: " + emp.name +
                ", Email: " + emp.email);
    }
}
