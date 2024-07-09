package java0708;

import java.util.Scanner;

public class intnum {
	public static int getnum(String msg, Scanner scan) {
	System.out.print(msg);
	String input = scan.nextLine();
	return Integer.parseInt(input);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = getnum("숫자를 입력하세요" ,sc);
		if(num > -1) {
			System.out.printf("%d", num);
		} else {
			int num2 = Math.abs(num);
			System.out.printf("%d", num2);
		}
	}
}
