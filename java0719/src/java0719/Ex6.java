package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;


public class Ex6 {

	public static void main(String[] args) {
		
		String sql = "select * from customer";
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt= null;
		try {
		Class.forName("com.mysql.cj,jdbc.Driver");
		con = DriverManager.getConnection(URL, "spring5", "spring5");
		System.out.println("Mysql 접속 성공!");
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString("customer_id"));
		}
		
		
		
		
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
		}
		
	}


