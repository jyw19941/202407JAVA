package java0711;

import java.util.Scanner;

public class BankEx {
	public static void main (String[] args) {
		boolean run =true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		String logid = "java";
		String logpw = "1111";
		
		while(run) {
			System.out.println("");
			System.out.println("-----------------------------------");
			System.out.println("1.로그인 | 2.회원가입 |3.예금/출금|4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 >");
			int menuNum = Integer.parseInt(scan.nextLine());
			
			
			switch(menuNum) {
			case 1:
				System.out.println("로그인 처리");
				System.out.print("ID :");
				String ID = scan.nextLine();
				System.out.print("Password : ");
				String strPw = scan.nextLine();
				int Pw = Integer.parseInt(strPw);
				if (ID.equals("java")) {
					if (Pw == 12345) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패:패스워드가 틀림");
					}
				} else {
					System.out.println("로그인 실패:아이디 존재하지 않음");
				}
				break;
			case 2:
				System.out.println("회원 가입");
				
				System.out.println("[필수 정보 입력]"); 
				System.out.print("1. 이름: ");
				String name2 = scan.nextLine(); 
				System.out.print("2. 주민번호 앞 6자리: ");
				String ssn = scan.nextLine(); 
				System.out.print("3. 전화번호: "); 
				String tel = scan.nextLine();
				System.out.println();
				System.out.println("[입력된 내용]");
				System.out.println("1. 이름: " + name2);
				System.out.println("2. 주민번호 앞 6자리: " + ssn); 
				System.out.println("3. 전화번호: " + tel);
				
			case 3:
				System.out.println("예금 출금");
				boolean run2 = true;
				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scan.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						balance += Integer.parseInt(scan.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scan.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance);
						break;
					case 4:
						run2 = false;
						break;
					}
				
					System.out.println();
					}
					System.out.println("프로그램 종료");
					break;
				case 4:
					run = false;
					break;
				}
			}
			System.out.println("프로그램 종료");
		}
	}
