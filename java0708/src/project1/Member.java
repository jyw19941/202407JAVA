package project1;

public class Member {
	String Name;
	String number; //주민 번호
	String phone;
	int balance;
	@Override
	public String toString() {
		return "Member [Name=" + Name + ", number=" + number + ", phone=" + phone + ", balance=" + balance +"]";
	}
	public Member(String name, String number, String phone) {
		super();
		this.Name = name;
		this.number = number;
		this.phone = phone;
	}

//	public Member(String name, String number, String phone) {
//		
//	}
	
}
