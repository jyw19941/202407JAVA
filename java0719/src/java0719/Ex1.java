package java0719;

public class Ex1 {
	public void main (String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("클래스있다");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
