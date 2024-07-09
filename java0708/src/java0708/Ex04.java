package java0708;

import java.util.Scanner;

public class Ex04 {
	public static int getnum(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		int apple = getnum("사과의 개수 입력", scanner);
		//System.out.print("사과의 개수 입력: ");
		//String input = scanner.nextLine();
		//return getnum;
		int people = getnum("친구 명수 입력", scanner);
		//int apple = Integer.parseInt(input);
		//System.out.print("친구 명수 입력 :");
		//input = scanner.nextLine();
		//int people = Integer.parseInt(input);
		
		
		int result = apple % (people+1);
		System.out.printf("남은 사과의 개수 : %d개\n", result);
		
	}
}
