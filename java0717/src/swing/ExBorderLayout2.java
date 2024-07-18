package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExBorderLayout2 extends JFrame{


	JButton jb1 = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	JButton jb3 = new JButton("버튼3");
	JButton jb4 = new JButton("버튼4");
	JButton jb5 = new JButton("버튼5");
	
	 ExBorderLayout2() {
		 Container con = this.getContentPane();
		 con.setLayout(new BorderLayout());
		 con.add(jb1, BorderLayout.NORTH);
		 con.add(jb2, BorderLayout.WEST);
		 con.add(jb3, BorderLayout.CENTER); 
		 con.add(jb4, BorderLayout.EAST);
		 con.add(jb5, BorderLayout.SOUTH);
		 
		 
		 this.setLocation(400,400);
		 this.setSize(700,500);
		 this.setVisible(true);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ExBorderLayout2();
	}

}
