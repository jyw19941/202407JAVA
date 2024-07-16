package java0711;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int sum = 0;
	Scanner scan = new Scanner(System.in);
	System.out.print("n값을 작성하시오");
	int n = scan.nextInt();
//		for(int i =1; i<=n; i++) {
//			if(i < n) {
//				System.out.print(i + "+");
//			} else {
//				System.out.print(i + "=");
//			}
//			sum += i;
//		}
//		System.out.print(sum);
	
	for(int i =1; i<n; i++) {
		System.out.print(i + "+");
		sum += i;
		}
	
	System.out.println(n + "=");
	sum += n;
	System.out.println(sum);
	}
}
