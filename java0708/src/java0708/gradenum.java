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
		
		if(num > 100) {
			System.out.print("점수를 다시 입력하세요!");
		} else if (num > 89) {
			System.out.print("A입니다");
		} else if (num > 79) {
			System.out.print("B입니다");
		} else if (num > 69) {
			System.out.print("C입니다");
		} else if (num > 59) {
			System.out.print("D입니다");
		} else {
			System.out.print("F입니다");
		}
	}
}
