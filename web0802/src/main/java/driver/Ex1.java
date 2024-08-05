package driver;

import board.BoardDAO;
import board.BoardDTO;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDAO dao= new BoardDAO();
		BoardDTO dto = new BoardDTO(17, "최하나2", "최희 글 제목2", "최의 글내용2", null, 0);
		dao.updateBoard(dto);
	}

}
