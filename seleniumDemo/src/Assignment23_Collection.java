

import java.util.Vector;

import java.util.*;
import java.util.regex.Pattern;



interface StudentOperations {
    void addStudent();
    void displayStudents();
    void searchStudent(int roll);
    void removeStudent(int roll);
}

class Student {
    int roll;
    String name;
    String mobile;

    Student(int roll, String name, String mobile) {
        this.roll = roll;
        this.name = name;
        this.mobile = mobile;
    }

    public String toString() {
        return roll + " | " + name + " | " + mobile;
    }
}


public class Assignment23_Collection implements StudentOperations {

    List<Student> list = new ArrayList<>();   // List
    Vector<Student> vector = new Vector<>();  // Vector
    Scanner sc = new Scanner(System.in);
    

    // REGEX
    String nameRegex = "^[A-Za-z ]+$";
    String mobileRegex = "^[6-9][0-9]{9}$";

    public void addStudent() {
        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mobile: ");
            String mobile = sc.nextLine();

            if (!Pattern.matches(nameRegex, name)) {
                System.out.println("Invalid Name!");
                return;
            }

            if (!Pattern.matches(mobileRegex, mobile)) {
                System.out.println("Invalid Mobile Number!");
                return;
            }

            Student s = new Student(roll, name, mobile);
            list.add(s);
            vector.add(s);

            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            System.out.println("Invalid Input!");
            sc.nextLine();
        }
    }

    public void displayStudents() {
        if (list.isEmpty()) {
            System.out.println("No Records Found!");
            return;
        }

        for (Student s : list) {
            System.out.println(s);
        }
    }

    public void searchStudent(int roll) {
        for (Student s : list) {
            if (s.roll == roll) {
                System.out.println("Student Found: " + s);
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    public void removeStudent(int roll) {
        Iterator<Student> it = list.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Student s = it.next();
            if (s.roll == roll) {
                it.remove();
                vector.remove(s);
                found = true;
                System.out.println("Student Removed!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    public static void main(String[] args) {

    	Assignment23_Collection  sm = new Assignment23_Collection ();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No: ");
                    sm.searchStudent(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Roll No: ");
                    sm.removeStudent(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Program Ended");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }
}
