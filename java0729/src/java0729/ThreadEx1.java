package java0729;

public class ThreadEx1 {
	
	public static void main(String[] args) {
		Thread mThread = Thread.currentThread();
		System.out.println(mThread.getName());
		
		ThreadA threadA = new ThreadA();
//		threadA.start();
		
		
		Thread threadB = new Thread(){
			
			public void run() {
				for(int i =0 ; i<2; i++) {
					System.out.println(this.getName());
				}
			}
			
		};
		threadB.setName("ThreadB");
		threadB.start();
		
		Thread threadC = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
	}
	
}
