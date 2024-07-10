package java0708;

public class forEx04 {
	public static void main(String[] args) {
		int i ;
		int x;
		for (i=1 ; i <10 ; i++) {
			System.out.println(i+"단");
			for(x=1; x<10; x++) {
				System.out.println(i +"X" + x +"=" +i*x);
			}
		}
	}
}
