package my.day9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEvent extends JFrame implements ActionListener
{
	JButton red, green, blue;
	
	//멤버 변수의 초기화, 객체생성
	public MyEvent() {
		red = new JButton("RED");
		green = new JButton("GREEN");
		blue = new JButton("BLUE");
		
		add(red, BorderLayout.EAST);
		add(green, BorderLayout.WEST);
		add(blue, BorderLayout.CENTER);
		
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyEvent my = new MyEvent();
		my.setVisible(true);
		my.setSize(500, 500);
		my.setTitle("MyEvent v.1.0");
	}
	//리스너가 갖고 있는 유일한 오버라이딩 메소드
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		//String str = e.getActionCommand();
		
		Object obj = e.getSource();
		
		if(obj==red) 
		{
			red.setBackground(Color.red);
		} else if(obj==green) 
		{
			green.setBackground(Color.green);
			
		} else if(obj==blue)	
		{
			blue.setBackground(Color.blue);
		}
	}
}
