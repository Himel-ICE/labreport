import java.sql.*;

public class show {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Statement stmt = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pust_ice", "root", "");
		System.out.println("Connection Eslablished");
		
		
		stmt = conn.createStatement();
		
		String sql = "SELECT * FROM student ";
		ResultSet  rs = stmt.executeQuery(sql);
		System.out.println("id      Name");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			
			System.out.println(id+"       "+name);
		}
		
	}
}
