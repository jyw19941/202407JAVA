package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		
		String sqlinsert =  "insert into dept(deptno, danme, loc) values(1001, '총무부','인천'),(1002,'인사부','일산),"
				+ "(1003,'회계부','서울')";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("접속 성공!");
			stmt = conn.createStatement();
			stmt.executeUpdate(sqlinsert);
			System.out.println("입력 성공!");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
