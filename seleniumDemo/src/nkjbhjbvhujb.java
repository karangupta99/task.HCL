



import java.sql.*;

public class kjbhjbvhujb
{
	public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb",
                    "root",
                    "root");

            // 3. Statement - SELECT
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(rs.getInt("eno"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("per"));
            }

            // 4. UPDATE
            stmt.executeUpdate("DELETE FROM student WHERE eno = 1");

            // 5. PreparedStatement - INSERT
            String sql = "INSERT INTO student (eno, name, branch, sem) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 12);
            ps.setString(2, "Ajay");
            ps.setString(3, "CSE");
            ps.setString(4, "VII");

            ps.executeUpdate();

            // 6. Close connections
            ps.close();
            stmt.close();
            con.close();

            System.out.println("Operations completed successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


String s = "update students set sem = ? where eno = ?";
PreparedStatement pstmt = con.PreparedStatement(s);
pstmt.setInt(2,111);
pstmt.setString(1,"V");
int rowAffected = pstmt.executeUpdate();

System.out.println(rowAffected + "row(s) affected.");

String s = "update students set sem ="v " where eno = 111;
		 "Statementpstmt = con.createStatement();"
		 int rowAffected = pstmt.executeUpdate();

System.out.print(rowsAffected+"row(s) affected.");
		
String s = "delete from students where eno = 11";

// databese me likhna padega is code ko 


String callProcedure = "{call dispMystude}";
CallableStatement stmt = con.prepareCall(callProcedure);
rs = stmt.executeQuery();

