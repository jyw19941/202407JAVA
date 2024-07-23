package thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
public static void main(String[] args) {
	
	Thread thread = new Thread(new BeepTask());
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i = 0 ; i<5; i++) {
		toolkit.beep();
		try {
			Thread.sleep(500);
			}
		catch(Exception e) {}
	}
	for(int i = 0 ; i<5; i++) {
		System.out.println("띵");
		try {
			Thread.sleep(500);
			}
		catch(Exception e) {}
		}
	}
}

