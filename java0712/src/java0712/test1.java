package java0712;

import java.util.Scanner;

public class test1 {
	public static void main(String [] args) { //2차원 배열을 이용하여 국어 점수와 수학 점수를 입력받아서 학생별 평균을 출력하는 프로그램을 작성
		
		Scanner scan =new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 >>");
		int std = Integer.parseInt(scan.nextLine());
		double avg = 0;
		
		double array[][] = new double [std][3]; //국 , 수 , 평균
		
		for(int i = 0 ; i< array.length; i++) {
			System.out.println(i+ "번째 학생");
			System.out.print("국어점수 : ");
			array[i][0] = Double.parseDouble(scan.nextLine());
			
			System.out.print("수학점수 : ");
			array[i][1] = Double.parseDouble(scan.nextLine());
			
			array[i][2] = (array[i][0] + array[i][1]) / 2;
		}
		System.out.printf("\t국어\t수학\t평군\n");
		System.out.println("==========================");
		for(int i = 0 ; i< array.length; i++) {
			System.out.print(i+ "번째 학생");
			System.out.printf("%3.2f\t%3.2f\t%3.2f\n", array[i][0],array[i][1],array[i][2]);
		}
		
	}
}
