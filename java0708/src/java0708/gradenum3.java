package java0708;

import java.util.Scanner;

public class gradenum3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		String score = scan.nextLine();
		int grade = Integer.parseInt(score);
		
		
		switch(grade/10) {
		case 9:
			System.out.println("A ");
			score = "A";
			break;
		case 8:
			System.out.println("B");
			score = "B";
			break;
		case 7:
			System.out.println("C");
			score = "C";
			break;
		case 6:
			System.out.println("D");
			score = "D";
			break;
		default:
			System.out.println("F");
			score = "F";
		}
		System.out.println(score);
	}
}
