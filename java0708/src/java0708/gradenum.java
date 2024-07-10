package java0708;

import java.util.Scanner;

public class gradenum {
	public static int getnum(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num =getnum("점수를 입력하세요",sc);
		String score = "";
		
		if(num > 100) {
			System.out.print("점수를 다시 입력하세요!");
		} else if (num > 89) {
			score = "A";
		} else if (num > 79) {
			score = "B";
		} else if (num > 69) {
			score = "C";
		} else if (num > 59) {
			score = "D";
		} else {
			score = "F";
		}
		System.out.println(score);
	}
}
