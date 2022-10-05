package MySQLJDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlExceptions {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String connectionUrl = "jdbc:mysql://localhost:3306/opentutorials?useUnicode=true&characterEncoding=UTF-8&user=root&password=koreait";
		try (Connection conn = DriverManager.getConnection(connectionUrl)) {
			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO topic VALUES(NULL, 'Java', 'Java is ...', NOW());");
			ps.execute();
			System.out.println("Count: " + ps.getUpdateCount());
			
			ps = conn.prepareStatement("INSER INTO topic VALUES(NULL, 'Java', 'Java is ...', NOW());");
			ps.execute();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
//		} finally {
//			conn.close();
		}
	}
}
