package my.day9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
//마우스 이벤트를 이용한 그림판 만들기
public class MyDrawing1 extends JFrame implements MouseMotionListener
{
	int x = 50, y = 50;
	
	public MyDrawing1 () 
	{
		super("::MyDrawing1::");
		addMouseMotionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자...
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		setTitle("x: " + x + ", y : " + y);
		repaint();
	}
	public void paint(Graphics g)
	{
	g.setColor(Color.BLUE);
	g.fillOval(x, y, 5, 5);
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	class MyHandler implements MouseMotionListener
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			x = e.getX();
			y = e.getY();
			setTitle("x: " + x + ", y : " + y);
			repaint();
		}
		@Override
		public void mouseMoved(MouseEvent arg0)
		{
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyDrawing1 md1 = new MyDrawing1();
		md1.setSize(500, 500);
		md1.setVisible(true);
	}
}

