package assignment4.task;

import java.sql.Connection;
import java.sql.DriverManager;

public class Task1 {

    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        Connection con = null;

        try {
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection
            con = DriverManager.getConnection(url, username, password);

            // Step 3: Check connection
            if (con != null) {
                System.out.println("Connection Successful");
            }

        } catch (Exception e) {
            System.out.println("Unable to connect");
            e.printStackTrace();
        }
    }
}
