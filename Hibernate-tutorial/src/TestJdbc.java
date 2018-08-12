
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	
	public static void main(String[] args) throws SQLException {
		
		String jdbcurl = "jdbc:mysql://192.168.1.212:3306/springdemo?useSSL=false&&serverTimezone=UTC";
		
		//jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
		
		Connection connection = DriverManager.getConnection(jdbcurl, "springdemo", "springdemo");
		
		System.out.println("Connection Successfull...");
		
	}

}
