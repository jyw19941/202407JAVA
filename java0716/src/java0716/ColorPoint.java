package java0716;

public class ColorPoint extends Point{
	public ColorPoint() {
		super(100,200);
		System.out.println("자식 기본 생성자 호출");
		System.out.println(x);
	}
	public ColorPoint(int x,int y) {
		super(x,y);
	}
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("자식이 오버라이딩");
		super.method1();
	}
	
	
	
	
}
