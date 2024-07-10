package java0708;

import java.util.Scanner;

public class max {
	public static int getnum(String msg, Scanner scan) {
		System.out.printf(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =getnum("첫번째 숫자를 입력하세요",sc);
		
		//System.out.print("숫자를 입력하세요");
		//String input = sc.nextLine();
		//int num1 = Integer.parseInt(input);
		int num2 = getnum("두번째 숫자를 입력하세요",sc);
		//System.out.print("숫자를 입력하세요");
		//input = sc.nextLine();
		//int num2 = Integer.parseInt(input);
		
		if(num1 > num2) {
			System.out.printf("%d이 더 큽니다 ",num1);
		} else if(num1 <num2) {
			System.out.printf("%d이 더 큽니다", num2);
		} else {
			System.out.printf("%d 와 %d 는 같은 숫자입니다", num1, num2);
		}
	}
}
