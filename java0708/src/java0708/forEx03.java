package java0708;

public class forEx03 {
	public static void main(String[] args) {
		int i;
		int x = 0;
		
		for(i = 0; i <= 10 ; i= i+2) {
			System.out.println(i);
			x += i;
		}
		System.out.println(x);
	}
}
