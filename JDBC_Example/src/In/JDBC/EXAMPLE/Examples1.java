package In.JDBC.EXAMPLE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examples1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn=null;
		ResultSet rs=null;
		Statement st=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","Karan@123");
		st=conn.createStatement();
		rs=st.executeQuery("Select * from Student");
		while(rs.next()) {
			System.out.println(rs.getString("stu_name"));
			System.out.println(rs.getInt("roll_no"));
			System.out.println(rs.getString("branch"));
		}
		String query="Insert into Student values('Aniket',32,'DS')";
		int n=st.executeUpdate(query);
		rs=st.executeQuery("Select * from Student");
//		while(rs.next()) {
//			System.out.println(rs.getString("stu_name"));
//			System.out.println(rs.getInt("roll_no"));
//			System.out.println(rs.getString("branch"));
//		}
		System.out.println("after deletion");
		
		int affect=st.executeUpdate("Update Student set stu_name='Raj' where roll_no= 1");
		st.executeUpdate("Delete from Student where roll_no = 32 ");
		rs=st.executeQuery("Select * from Student");
		while(rs.next()) {
			System.out.println(rs.getString("stu_name"));
			System.out.println(rs.getInt("roll_no"));
			System.out.println(rs.getString("branch"));
		}
     
	}

}
