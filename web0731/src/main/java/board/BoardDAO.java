package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class BoardDAO {
	//JDBC 관련 변수
	private Connection conn =null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String BOARD_LIST = "select * from board";
	private String BOARD_UPDATE = "update board set writer = ?, title = ?, content = ?, regtime = now() where num = ?";
	private String BOARD_DELETE = "delte from board where num = ?";
	private String BOARD_ONE = "select * from board where num = ?";
	private String BOARD_INSERT = "insert into board (writer, title, content, regtime,hits)values(?,?,?,now(),0)";
	//게시판 등록
	public void insertBoard(BoardDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_INSERT);	
			stmt.setString(1, dto.getWriter());
			stmt.setString(2, dto.getTitle());
			stmt.setString(3, dto.getContent());
			stmt.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
		
	}
	
	//게시판 수정
	public void updateBoard(BoardDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, dto.getWriter());
			stmt.setString(2, dto.getTitle());
			stmt.setString(3, dto.getContent());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	public BoardDTO getOne(int num) {
		List<BoardDTO> list1 = new ArrayList<>();
		BoardDTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_ONE);
			stmt.setInt(1, num);
			rs = stmt.executeQuery();
			if (rs.next()) {
			dto = new BoardDTO(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
					rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
		
		
		return dto;
	}
	
	//게시판 목록조회
	public List<BoardDTO> getBoardList(){
		List<BoardDTO> list = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		try {
		stmt = conn.prepareStatement(BOARD_LIST);
		rs = stmt.executeQuery();
		while (rs.next()){
			BoardDTO dto = new BoardDTO(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
									rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
			list.add(dto);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt,conn);
		}
		
		return list ;
	}
}
