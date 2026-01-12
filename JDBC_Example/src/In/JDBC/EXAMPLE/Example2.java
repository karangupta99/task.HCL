package In.JDBC.EXAMPLE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","Karan@123");
        ps=conn.prepareStatement("Insert into student values(?,?,?)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        ps.setString(1, name);
        ps.setInt(2, 20);
        ps.setString(3, "AIML");
        int res = ps.executeUpdate();
        System.out.println(res + " Data added");
        rs=ps.executeQuery("Select * from student");
        while(rs.next()) {
        	System.out.println("name is "+rs.getString("stu_name")+" roll no is "+rs.getInt("roll_no")+" branch is "+rs.getString("branch"));
        }
	}
}
