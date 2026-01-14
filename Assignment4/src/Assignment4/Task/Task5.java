package Assignment4.Task;



package Assignment4.Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task5 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl", "root", "Karan@123");

        st = conn.createStatement();

        // 🔹 Select students whose semester is 7 and branch is EC
        rs = st.executeQuery("SELECT * FROM Student WHERE semester=7 AND branch='EC'");

        // 🔹 Display records
        while (rs.next()) {
            System.out.println("Name: " + rs.getString("stu_name"));
            System.out.println("Roll No: " + rs.getInt("roll_no"));
            System.out.println("Branch: " + rs.getString("branch"));
            System.out.println("Semester: " + rs.getInt("semester"));
            System.out.println("Percentage: " + rs.getDouble("percentage"));
            System.out.println("-------------------");
        }

        conn.close();
    }
}
