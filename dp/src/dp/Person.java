package dp;

public class Person {
	private Phone[] phones = new Phone[2];
	
	
	public Person() {
		phones = new Phone[2];
		
	}
	
	public Phone getPhone(int i) { //나쁜 설계
		
		if(i==0 || i==1) {
			return phones[i]; //0일때는 집 전화 , 1일떄는 회사 전화
		}
		return null;
	}
}
