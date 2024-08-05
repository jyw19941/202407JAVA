package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class AccountDAO {
	private Connection conn =null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String ACCOUNT_LIST = "select * from account";
	private String ACCOUNT_ONE = "select * from account where id = ?";
	private String ACCOUNT_COUNT = "select count(*) from account where name=? and ssn = ?";
	
	//로그인 확인
	public boolean checkLogin(String name , String ssn) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACCOUNT_COUNT);
			stmt.setString(1, name);
			stmt.setString(2, ssn);
			rs = stmt.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			if(count == 1) {
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
		return false;
		
	}
	
	
	public List<AccountDTO> getBoardList(){
		List<AccountDTO> list = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		try {
		stmt = conn.prepareStatement(ACCOUNT_LIST);
		rs = stmt.executeQuery();
		while (rs.next()){
//			AccountDTO dto = new AccountDTO(0, getid(), 0, ACCOUNT_LIST, 0)
//			list.add(dto);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt,conn);
		}
		
		return list ;
	}
}
