package java0711;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2자리의 양수를 입력하세요 >>");
		int n;
		do {
			System.out.print("n값");
			n = scan.nextInt();
		}while(n <10 || n > 99);

		System.out.println("n값은 " +n);
	}
}
