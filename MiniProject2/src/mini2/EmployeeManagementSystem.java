package mini2;


import java.io.*;
import java.util.*;

// -------- Employee Class --------
class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

//  Main Class
public class EmployeeManagementSystem {

    static final String FILE_NAME = "employees.dat";
    static Scanner sc = new Scanner(System.in);
    static List<Employee> employees = new ArrayList<>();

    // -------- LOGIN SYSTEM --------
    static boolean login() {
        String USERNAME = "admin";
        String PASSWORD = "admin123";

        System.out.print("Enter Username: ");
        String u = sc.next();
        System.out.print("Enter Password: ");
        String p = sc.next();

        if (u.equals(USERNAME) && p.equals(PASSWORD)) {
            System.out.println("Login Successful\n");
            return true;
        } else {
            System.out.println("Invalid Login Credentials");
            return false;
        }
    }

    // -------- FILE LOAD --------
    static void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
        } catch (Exception e) {
            employees = new ArrayList<>();
        }
    }

    // here FILE SAVE  program
    static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
        } catch (Exception e) {
            System.out.println("Error Saving File");
        }
    }

    //  ADD EMPLOYEE 
    static void addEmployee() {
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            for (Employee e : employees)
                if (e.id == id)
                    throw new Exception("Employee ID must be unique");

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Department: ");
            String dept = sc.next();
            if (dept.isEmpty())
                throw new Exception("Department cannot be empty");

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0)
                throw new Exception("Salary must be positive");

            employees.add(new Employee(id, name, dept, sal));
            saveToFile();
            System.out.println("Employee Added Successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    //  DISPLAY 
    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found");
            return;
        }
        for (Employee e : employees)
            System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
    }

    // -------- SEARCH --------
    static void searchEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        for (Employee e : employees) {
            if (e.id == id) {
                System.out.println("Found: " + e.name + " " + e.salary);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    // -------- UPDATE SALARY --------
    static void updateSalary() {
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            for (Employee e : employees) {
                if (e.id == id) {
                    System.out.print("Enter New Salary: ");
                    double sal = sc.nextDouble();
                    if (sal <= 0)
                        throw new Exception("Salary must be positive");
                    e.salary = sal;
                    saveToFile();
                    System.out.println("Salary Updated");
                    return;
                }
            }
            System.out.println("Employee Not Found");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //  DELETE 
    static void deleteEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            if (it.next().id == id) {
                it.remove();
                saveToFile();
                System.out.println("Employee Deleted");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    //  SORT
    static void sortEmployees() {
        employees.sort(Comparator.comparing(e -> e.name));
        displayEmployees();
    }

    //  DEPARTMENTS 
    static void displayDepartments() {
        Set<String> depts = new HashSet<>();
        for (Employee e : employees)
            depts.add(e.department);

        System.out.println("Departments:");
        for (String d : depts)
            System.out.println(d);
    }

    //  MAIN MENU 
    public static void main(String[] args) {

        loadFromFile();

        if (!login())
            return;

        while (true) {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Display All Employees");
            System.out.println("3.Search Employee");
            System.out.println("4.Update Employee Salary");
            System.out.println("5.Delete Employee");
            System.out.println("6.Display Sorted Employees");
            System.out.println("7.Display Departments");
            System.out.println("8.Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> addEmployee();
                case 2 -> displayEmployees();
                case 3 -> searchEmployee();
                case 4 -> updateSalary();
                case 5 -> deleteEmployee();
                case 6 -> sortEmployees();
                case 7 -> displayDepartments();
                case 8 -> System.exit(0);
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
