package java0708;

import java.util.Scanner;

public class forEx05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를쓰시오 : ");
		int i = scan.nextInt();
		
		System.out.println("***"+i+"단 ***");
		
		int result ;
		
		if(true) {
			for(result= 1; result<10; result++) {
				System.out.println(i + "X" +result + "=" +i*result);
			}
		}
		
	}
}
