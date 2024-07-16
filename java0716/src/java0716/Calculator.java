package java0716;

public class Calculator {
	
	
	int plus(int x, int y) {
		int result = x+y;
		return x + y;
	}
	
	double avg(int x, int y) {
//		double result = sum/2;
//		double sum = plus(x,y);
		return this.plus(x, y) / 2.0;
	}
	
	void execute() {
		double result = avg(7,10);
		this.println("실행결과" +avg(7,10));
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
}
