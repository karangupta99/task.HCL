package miniproject3;

import java.sql.*;
import java.util.Scanner;

public class StudentManagementSystem {

    static Connection conn;
    static Statement st;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hcl", "root", "Karan@123");
            st = conn.createStatement();

            if (!login()) {
                System.out.println("Invalid username or password");
                return;
            }

            int choice;
            do {
                System.out.println("\n1.Add Student");
                System.out.println("2.Display All Students");
                System.out.println("3.Search Student by Eno");
                System.out.println("4.Update Student Branch");
                System.out.println("5.Delete Student by Eno");
                System.out.println("6.Display Sorted Students");
                System.out.println("7.Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1: addStudent(); break;
                    case 2: displayAll(); break;
                    case 3: searchStudent(); break;
                    case 4: updateBranch(); break;
                    case 5: deleteStudent(); break;
                    case 6: displaySorted(); break;
                    case 7: System.out.println("Exit"); break;
                    default: System.out.println("Invalid choice");
                }
            } while (choice != 7);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Login
    static boolean login() throws SQLException {
        sc.nextLine();
        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();

        ResultSet rs = st.executeQuery(
                "SELECT * FROM users WHERE username='" + u + "' AND password='" + p + "'");
        return rs.next();
    }

    // Add Student
    static void addStudent() {
        try {
            System.out.print("Eno: ");
            int eno = sc.nextInt();
            sc.nextLine();

            ResultSet rs = st.executeQuery("SELECT * FROM Student WHERE eno=" + eno);
            if (rs.next()) {
                System.out.println("Eno must be unique");
                return;
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Branch: ");
            String branch = sc.nextLine();
            if (branch.isEmpty()) {
                System.out.println("Branch cannot be empty");
                return;
            }

            System.out.print("Semester: ");
            int sem = sc.nextInt();
            if (sem <= 0) {
                System.out.println("Invalid semester");
                return;
            }

            System.out.print("Percentage: ");
            double per = sc.nextDouble();
            if (per < 0) {
                System.out.println("Percentage must be positive");
                return;
            }

            st.executeUpdate(
                    "INSERT INTO Student VALUES(" + eno + ",'" + name + "','" + branch + "'," + sem + "," + per + ")");
            System.out.println("Student added");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Display All
    static void displayAll() {
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM Student");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getString(3) + " " +
                                   rs.getInt(4) + " " +
                                   rs.getDouble(5));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Search
    static void searchStudent() {
        try {
            System.out.print("Enter Eno: ");
            int eno = sc.nextInt();
            ResultSet rs = st.executeQuery("SELECT * FROM Student WHERE eno=" + eno);
            if (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getString(3) + " " +
                                   rs.getInt(4) + " " +
                                   rs.getDouble(5));
            } else {
                System.out.println("Student not found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Update Branch
    static void updateBranch() {
        try {
            System.out.print("Eno: ");
            int eno = sc.nextInt();
            sc.nextLine();
            System.out.print("New Branch: ");
            String branch = sc.nextLine();

            if (branch.isEmpty()) {
                System.out.println("Branch cannot be empty");
                return;
            }

            int n = st.executeUpdate(
                    "UPDATE Student SET branch='" + branch + "' WHERE eno=" + eno);
            if (n == 0)
                System.out.println("Student not found");
            else
                System.out.println("Branch updated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Delete
    static void deleteStudent() {
        try {
            System.out.print("Eno: ");
            int eno = sc.nextInt();
            int n = st.executeUpdate("DELETE FROM Student WHERE eno=" + eno);
            if (n == 0)
                System.out.println("Student not found");
            else
                System.out.println("Student deleted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Sorted Display
    static void displaySorted() {
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM Student ORDER BY percentage DESC");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getString(3) + " " +
                                   rs.getInt(4) + " " +
                                   rs.getDouble(5));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
