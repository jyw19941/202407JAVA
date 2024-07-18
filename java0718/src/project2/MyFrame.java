package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	
	JLabel la1= new JLabel("아이디");
	JLabel la2= new JLabel("ssn");
	JLabel la3= new JLabel("전화번호");
	
	JTextField tf1 = new JTextField(7);
	JTextField tf2 = new JTextField(7);
	JTextField tf3 = new JTextField(10);
	
	JTextArea ta1 = new JTextArea();
	
	JButton btn1 = new JButton("로그인");
	JButton btn2 = new JButton("회원가입");
	JButton btn3 = new JButton("예금");
	JButton btn4 = new JButton("출금");
	JButton btn5 = new JButton("잔고");
	
	
	MyFrame() {
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(jp1, BorderLayout.NORTH);
		jp1.setLayout(new FlowLayout(50,15,50));
		jp1.add(la1);
		jp1.add(tf1);
		jp1.add(la2);
		jp1.add(tf2);
		jp1.add(la3);
		jp1.add(tf3);
		
		con.add(jp2, BorderLayout.CENTER);
		jp2.setLayout(new FlowLayout());
		jp2.add(ta1);
		
		con.add(jp3, BorderLayout.SOUTH);
		jp3.setLayout(new FlowLayout(100,10,50));
		jp3.add(btn1);
		jp3.add(btn2);
		jp3.add(btn3);
		jp3.add(btn4);
		jp3.add(btn5);
		
		

		
		
//		con.add(btn1);
//		con.add(btn2);
//		con.add(btn3);
//		con.add(btn4);
//		con.add(btn5);
		
		
		
		this.setBounds(1200,100,700,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
