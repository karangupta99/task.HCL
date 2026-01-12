package assignment2;


import java.util.*;
import java.util.regex.Pattern;

// Interface
interface StudentOperations {
    void addStudent();
    void displayStudents();
    void removeStudent(int roll);
    void searchStudent(int roll);
}

// Student Class
class Student {
    int roll;
    String name;
    String email;

    Student(int roll, String name, String email) {
        this.roll = roll;
        this.name = name;
        this.email = email;
    }
}

public class studentManagement implements StudentOperations {

    Scanner sc = new Scanner(System.in);

    // Using List with ArrayList & Vector
    List<Student> students = new ArrayList<>();
    Vector<Student> backup = new Vector<>();

    // REGEX
    final String NAME_REGEX = "^[A-Za-z ]+$";
    final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

    public static void main(String[] args) {
        studentManagement obj = new studentManagement();
        obj.menu();
    }

    void menu() {
        while (true) {
            try {
                System.out.println("\n--- Student Management Menu ---");
                System.out.println("1. Add Student");
                System.out.println("2. Display Students");
                System.out.println("3. Remove Student by Roll");
                System.out.println("4. Search Student by Roll");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        displayStudents();
                        break;
                    case 3:
                        System.out.print("Enter Roll Number: ");
                        removeStudent(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Enter Roll Number: ");
                        searchStudent(sc.nextInt());
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

    // Add Student
    public void addStudent() {
        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
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

            Student s = new Student(roll, name, email);
            students.add(s);
            backup.add(s);

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            System.out.println("Error while adding student");
            sc.nextLine();
        }
    }

    // Display Students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No Records Found");
            return;
        }

        for (Student s : students) {
            System.out.println("Roll: " + s.roll +
                    ", Name: " + s.name +
                    ", Email: " + s.email);
        }
    }

    // Remove Student
    public void removeStudent(int roll) {
        Iterator<Student> itr = students.iterator();
        boolean found = false;

        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.roll == roll) {
                itr.remove();
                found = true;
                System.out.println("Student Removed");
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    // Search Student
    public void searchStudent(int roll) {
        for (Student s : students) {
            if (s.roll == roll) {
                System.out.println("Student Found:");
                System.out.println("Roll: " + s.roll +
                        ", Name: " + s.name +
                        ", Email: " + s.email);
                return;
            }
        }
        System.out.println("Student Not Found");
    }
}
