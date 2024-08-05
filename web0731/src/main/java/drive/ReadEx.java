package drive;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import board.BoardDAO;
import board.BoardDTO;

public class ReadEx {
	public static void main(String [] args) throws IOException {
		
//		FileReader reader = new FileReader("C:/Temp/test7.txt");
		String line = "";
		BoardDAO dao = new BoardDAO();
		
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/board1.csv"));//보조 스트림
		while((line = br.readLine()) != null) {
			//CSV 파일의 각 줄을 쉼표로 분리
			String[] data = line.split(", ");
			
//			System.out.println(data[0]);
//			System.out.println(data[1]);
//			System.out.println(data[2]);
			BoardDTO dto = new BoardDTO(0, data[0], data[1], data[2], "", 0);
			System.out.println(dto);
			dao.insertBoard(dto);
			System.out.println("입력완료!");
			
			
			//분리된 데이터 출력
//			for(String element : data) {
//				System.out.println(element + " ");	
//			}
			
		}
		br.close();
	}
}
