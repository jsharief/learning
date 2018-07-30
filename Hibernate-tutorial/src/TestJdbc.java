import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	
	public static void main(String[] args) throws SQLException {
		
		String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&&serverTimezone=UTC";
		
		//jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
		
		Connection connection = DriverManager.getConnection(jdbcurl, "hbstudent", "hbstudent");
		
		System.out.println("Connection Successfull...");
		
	}

}
