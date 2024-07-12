package java0708;

import java.util.Scanner;

public class forEx07 {
	public static int sumOf(int x,int z) {
		int min;
		int max;
		int sum = 0;
		
		if(x < z) {
			min = x; max = z;
		} else {
			min = z; max = x;
		}
		
		for(int i = min; i <= max; i++) {
			sum +=i;
		}
		
		return sum;
//		if(x >z) {
//		for (int i = x; i <=z; i ++) {
//			sum += i;
//		}
//	} else if(z > x) {
//		for(int i = z; i <=x; i++) {
//			sum += i;
//		}
//	} else {
//		sum = x;
//	}
		
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번쨰 정수를 입력하세요");
		int a = scan.nextInt();
		System.out.print("두번쨰 정수를 입력하세요");
		int b = scan.nextInt();
		
		int result = sumOf(a,b);
		System.out.print(result);
	}
}
