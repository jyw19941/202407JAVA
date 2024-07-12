package java0708;

import java.util.Scanner;

public class middlenum {
	public static int midnum(int a, int b, int c) {
		
		if((b >= a && c<=a) || (b <= a && c>= a)) {
			return a;
		} else if ((a > b && c < b) || ( a < b && c > b)) {
			return b;
		} else {
			return c;
		}
//		if(a >= b) {
//			if(b >=c) {
//				return(b);
//			} else if (a<=c) {
//				return(a);
//			} else {
//				return(c);
//			}
//			
//		} else if(a>c) {
//			return(a);
//		} else if(b >c) {
//			return(c);
//			
//		} else {
//			return(b);
//		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 3개를 입력하세요");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		System.out.println("중앙값은" +midnum(x, y, z));
//		if(x >= y) {
//			if(y >=z) {
//				System.out.println(y);
//			} else if (x<=z) {
//				System.out.println(x);
//			} else {
//				System.out.println(z);
//			}
//			
//		} else if(x>z) {
//			System.out.println(x);
//		} else if(y >z) {
//			System.out.println(z);
//			
//		} else {
//			System.out.println(y);
//		}
	
	}
}
