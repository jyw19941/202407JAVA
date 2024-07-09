package java0708;

public class Ex03 {
	public static void swap(int a, int b) {
		int tem = a;
		a = b;
		b = tem;
		System.out.printf("%d %d",a,b);
	}
	public static void main(String[] args) {
		int x= 10;
		int y= 20;
		System.out.printf("%d %d\n",x,y);
		swap(x,y);
	}

}
