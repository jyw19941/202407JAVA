package java0711;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int w;
		
		System.out.println("n개를 출력하되 w값마다 줄을 바꿔서 ");
		
		do {
			System.out.print("n 값: ");
			n = scan.nextInt();
			System.out.print("w 값 :");
			w = scan.nextInt();
		} while((n<=0 && w <= 0) && (w<n));
			  //(w <= 0 || w > nZ);
		for(int i = 0; i <n; i++) {
			System.out.print("*");
			if(i % w == w-1) {
				System.out.println("");
			}
			
		}
		
	}
}
