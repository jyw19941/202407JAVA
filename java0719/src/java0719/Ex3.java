package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Ex3 {

	public static void main(String[] args) {
		String createString = "CREATE TABLE custome" + 
				"(customer_id char(6) not null primary key," +
				"customer_name varchar(15) not null," +
				"customer_tel varchar(13)" +
				"customer_addr varchar(20))";
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt= null;
		try {
		Class.forName("com.mysql.cj,jdbc.Driver");
		con = DriverManager.getConnection(URL, "spring5", "spring5");
		System.out.println("Mysql 접속 성공!");
		stmt = con.createStatement();
		stmt.executeUpdate(createString);
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
		}
		
	}


