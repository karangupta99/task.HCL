package Assignment4.Task;



package Assignment4.Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl", "root", "Karan@123");

        st = conn.createStatement();

        // 🔹 Update query (5% increase for CSE students)
        int affected = st.executeUpdate(
                "UPDATE Student SET percentage = percentage + (percentage * 0.05) WHERE branch='CSE'");

        System.out.println(affected + " records updated");

        // 🔹 Display updated records
        rs = st.executeQuery("SELECT * FROM Student");

        while (rs.next()) {
            System.out.println(rs.getString("stu_name"));
            System.out.println(rs.getInt("roll_no"));
            System.out.println(rs.getString("branch"));
            System.out.println(rs.getDouble("percentage"));
            System.out.println(" ");
        }

        conn.close();
    }
}
