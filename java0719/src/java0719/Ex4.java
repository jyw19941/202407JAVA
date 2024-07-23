package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Ex4 {

	public static void main(String[] args) {
		
		String createString = "INSERT INTO customer VALUES ('C-1001', '가나다','010-1111-2222','서울'";
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


