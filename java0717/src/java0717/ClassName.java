package java0717;

public class ClassName {
	int field1;
	void method1() {
		ClassName.field2= 200;
	} //인스턴스 메서드 
	
	
	static int field2;
	static void method2() {}
	
	public static void main(String[] args) {
		ClassName.method2();
		System.out.println(ClassName.field2);
		ClassName c1 = new ClassName();
		c1.method2();
		System.out.println(c1.field1);
	}
	
}
