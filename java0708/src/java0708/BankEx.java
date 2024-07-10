package java0708;

import java.util.Scanner;

public class BankEx {
	public static void main(String[] args) {
		boolean run =true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 |3.잔고|4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 >");
			balance = scan.nextInt();
			
			if(balance ==1) {
				System.out.println("선택 >" +balance);
				System.out.println("예금액 > 10000");
				continue;
			} else if(balance==2) {
				System.out.println("선택 >" +balance);
				System.out.println("출금액> 2000");
				continue;
			} else if (balance==3) {
				System.out.println("선택 >" +balance);
				System.out.println("잔고 8000");
				continue;
			} else if (balance==4) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		
	}
}
