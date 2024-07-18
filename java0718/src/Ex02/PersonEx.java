package Ex02;

public class PersonEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Role role = driver;
		
		
		
		
		
		Person person = new Person();
		person.setRole(new Driver());
		person.doIt();
		person.setRole(new Worker());
		person.doIt();
		
	}
}
