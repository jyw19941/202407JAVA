package project1_2;

import java.io.Serializable;

public class Member implements Serializable {
	private String Name;
	private String number; //주민 번호
	private String phone;
	private int balance;
	
	public void deposit(int deposit) {
		if(deposit <= 0) {
			System.out.println("금액을 정확히 입력하세요");
			return;
		}
		balance += deposit;
	}
	
	public void withdraw(int withdraw) {
		if(withdraw > balance) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		
		balance -= withdraw;
	}
	
	
	
	
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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	
//	public Member(String name, String number, String phone) {
//		
//	}
	
}
