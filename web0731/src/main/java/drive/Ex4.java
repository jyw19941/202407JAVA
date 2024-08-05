package drive;

import board.BoardDAO;
import board.BoardDTO;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO(0, "김하늘", "김하늘의 글제목", "김하늘의 글제목","", 0);
		dao.updateBoard(dto);
		System.out.println("수정성공");
	}

}
