package java0708;

import java.util.Scanner;

public class forex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇자리의 합을 구할까요 >>");
		int n;
		int i ;
		int score = 0;
		do {
			System.out.print("n값 : ");
			 n = scan.nextInt();
		} while (n <=0);
		for(i =1; i <= n; i++) { 
			score += i; 
		}
		System.out.println(score);
	}
}
