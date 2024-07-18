package CarEx;

public class Tire {
	public int MaxRotation;
	public int accmulatedRotation;
	public String location;
	
	
	
	public Tire (String location, int MaxRotation) {
		this.location = location;
		this.MaxRotation = MaxRotation;
	}
	
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation < MaxRotation) {
			System.out.println(location + "타이어 수명: "+(MaxRotation-accmulatedRotation) +"회");
			return true;
		} else {
			System.out.println("***" +location + "타이어 펑크 ***");
			return false;
		}
	}
}
