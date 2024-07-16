package java0716;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MyFrame extends JFrame {
	JButton jb1= new JButton("테스트"); 
	JTextField jt1 = new JTextField();
	JTextArea ta = new JTextArea();
	JLabel lb1 = new JLabel("학생수");
	
	public MyFrame() {
		
		Container con = this.getContentPane();
		con.setLayout(null);
		con.add(lb1);
		lb1.setLocation(20,50);
		lb1.setSize(100,30);
		con.add(jt1);
		jt1.setLocation(80,50);
		jt1.setSize(100,30);
		ta.setLocation(20,120);
		ta.setSize(830,200);
		con.add(ta);
		jb1.setSize(100,30);
		jb1.setLocation(200,300);
		con.add(jb1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("안녕스윙");
		this.setLocation(700,500);
		this.setSize(900, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
