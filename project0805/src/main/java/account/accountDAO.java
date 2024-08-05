package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class accountDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String ACCOUNT_LIST = "select * from usertable";
	private String ACCOUNT_COUNT = "select count(*) as cnt from usertable where id = ? and pw = ?";
	private String ACCOUNT_INSERT = "insert into usertable(id,pw,username) values(?,?,?)";
	
	
	public boolean checkLogin(String id , String pw) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACCOUNT_COUNT);
			stmt.setString(1, id);
			stmt.setString(2, pw);
			rs = stmt.executeQuery();
			rs.next();
			int count = rs.getInt("cnt");
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
	
	public List<accountDTO> getBoardList(){
		List<accountDTO> list = new ArrayList<>();
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
	public void insertAccount(accountDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACCOUNT_INSERT);	
			stmt.setString(1, dto.getId());
			stmt.setString(2, dto.getPw());
			stmt.setString(3, dto.getName());
			stmt.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
}
