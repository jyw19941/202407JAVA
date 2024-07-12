package java0712;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >>>>");
		int num = Integer.parseInt(scan.nextLine());
		int arr[] = new int[num];
		
		for(int i= 0; i<num ;i++) {
			System.out.println(i+"n번째 값");
			arr[i] =  Integer.parseInt(scan.nextLine());
			
			
			
					
		}
		
		for(int n :arr) {
			System.out.println(n);
		}
	}
}
