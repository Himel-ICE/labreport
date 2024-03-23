import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Statement stmt = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pust_ice", "root", "");
		System.out.println("Connection Eslablished");
		
		
		stmt = conn.createStatement();
		
		String sql = "INSERT INTO student "+
				"VALUES (1, 'Fizan')";
		
		stmt.executeUpdate(sql);
		
		System.out.println("Insert Succesfully");
		
	}

}
