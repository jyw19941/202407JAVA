package java0718;

public class ChildEx {
	public static void main(String[] args) {
		Parent parent =new Child();
		anyMethod(parent);
		
		
		
		
		
		if(parent instanceof Child) {
			System.out.println("형변환");
		Child child = (Child)parent;
		child.method3();
		} else {
			System.out.println("타입 변환 불가능");
		}
		
	
		}
	public static void anyMethod(Parent parnet) {
		parnet.method2();
	}
}