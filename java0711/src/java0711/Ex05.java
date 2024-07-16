package java0711;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// + - 기호를 번갈아 출력하는 프로그램 
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다");
		
		do {
			System.out.print("n 값: ");
			n = scan.nextInt();
		} while(n<=0);
		
//		for(int i = 0 ; i < n ; i ++) {
//			if(i % 2 ==0) { //if(n % 2 !=0)
//				System.out.print("+");
//			}else {
//				System.out.print("-");
//			}
//		}
		
		for(int i = 0 ; i < n ; i ++) {
			System.out.print("+-");
		}
	}
}
