package my.day9;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
//마우스 이벤트를 이용한 그림판 만들기
public class MyDrawing2 extends JFrame implements MouseMotionListener
{
	//int x = 50, y = 50;
	MyCanvas m;
	
	public MyDrawing2 () 
	{
		super("::MyDrawing2::");
		setLayout(new FlowLayout());
		//addMouseMotionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m = new MyCanvas();
		m.setSize(300, 300);
		add(m);	
		m.setBackground(Color.WHITE);
		
		MyHandler mh = new MyHandler();
		m.addMouseMotionListener((MouseMotionListener) mh);
	
	}//생성자...
	
	public void mouseDragged(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		m.x = e.getX();
		m.y = e.getY();
		setTitle("x: " + m.x + ", y : " + m.y);
		m.repaint();
	}
	
	public void mouseMoved(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	//캔버스를 상속받은 나만의 캔버스 이너클래스(내부클래스) 생성
	class MyCanvas extends Canvas
	{
		int x = 50, y = 50;
		
		public void update(Graphics g)
		{
			paint(g);
		}
		
		public void paint(Graphics g)
		{
			g.setColor(Color.GREEN);
			g.fillOval(x, y, 7, 7);
		}
	}
	
	class MyHandler implements MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			m.x = e.getX();
			m.y = e.getY();
			setTitle("x: " + m.x + ", y : " + m.y);
			m.repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) 
		{
			// TODO Auto-generated method stub
		}
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyDrawing2 md1 = new MyDrawing2();
		md1.setSize(500, 500);
		md1.setVisible(true);
	}
	
}
	