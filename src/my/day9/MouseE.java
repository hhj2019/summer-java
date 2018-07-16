package my.day9;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MouseE extends Frame
{
	 
	String str ="클릭해보세요";
	int x= 50, y= 50;
	PopupMenu pm;
	MenuItem mi1, mi2;
	
	public MouseE() 
	{ 
		super("ㅇㅇㅇㅇㅇㅇ");
		pm = new PopupMenu();
		add(pm);
		
		mi1 =new MenuItem("열기");
		mi2 =new MenuItem("닫기");
		pm.add(mi1);
		pm.addSeparator();
		pm.add(mi2);
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
			});
		
		MyHandler my = new MyHandler();
		this.addMouseListener((MouseListener) my);
	}
	
	class MyHandler implements MouseListener 
	{ 
		
		@Override
		public void mouseClicked(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			System.out.println("Clicked");
			
		}
		@Override
		public void mouseEntered(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			setBackground(Color.YELLOW);
		}
		@Override
		public void mouseExited(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			setBackground(Color.BLUE);
		}
		@Override
		public void mousePressed(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			System.out.println("Pressed");
			x = e.getX();
			y =e.getY();
			setTitle("x: " + x + ", y : " + y);
			repaint();
			
			if(e.getModifiersEx()== (MouseEvent.BUTTON3_DOWN_MASK + MouseEvent.SHIFT_DOWN_MASK))
			pm.show(MouseE.this, x, y);
		}
		@Override
		public void mouseReleased(MouseEvent e)
		{
			// TODO Auto-generated method stub
			System.out.println("Released");
		}
	}
	
	public void paint(Graphics g) 
	{ 
		g.setColor(Color.red);
		g.drawString(str, x, y);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MouseE m = new MouseE();
		m.setVisible(true);
		m.setSize(500, 500);
		m.setTitle("MouseE v.1.0");
	}
}
	
	
	
	


	

