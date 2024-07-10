package java0708;

import java.util.Scanner;

public class gradenum2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		String inputData = sc.nextLine();
		int in = Integer.parseInt(inputData);
		
		String score = (in >= 90) ? "A" : (in >= 80) ? "B" : (in >= 70) ? "C" : (in >= 60) ? "D" : "F" ;
		
		System.out.print(score);
		
	}
}
