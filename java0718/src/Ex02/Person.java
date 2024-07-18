package Ex02;

public class Person {
	private Role role;
	
	public void doIt() {
		role.doIt();
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Driver driver) {
		this.role = driver;
	}

	public void setRole(Worker worker) {
		// TODO Auto-generated method stub
		
	}
}
