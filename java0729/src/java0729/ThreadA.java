package java0729;

public class ThreadA extends Thread {

	
	public ThreadA() {
		this.setName("ThreadA");
	}
	
	
	
	public void run() {
		for(int i = 0 ; i <2; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
