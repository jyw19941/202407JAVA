package CarEx;

public class HankookTire extends Tire{

	public HankookTire(String location, int MaxRotation) {
		super(location, MaxRotation);
		// TODO Auto-generated constructor stub
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
