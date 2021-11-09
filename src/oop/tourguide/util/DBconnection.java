package oop.tourguide.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

	public static Connection con()
		throws SQLException , ClassNotFoundException
		{
		
			
		 Class.forName("com.mysql.jdbc.Driver");

	        Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/onlinetourguide?useSSL=false", "root", "1234");
			return connection;
		}
	
}
