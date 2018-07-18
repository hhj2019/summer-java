package my.day12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame implements ActionListener, Runnable
{
	JTextArea jta;
	JPanel jp;
	JTextField jf;
	JButton jbt;
	
	Socket sock;
DataInputStream dis;
	DataOutputStream dos;
	
	public Client()
	{
		setTitle("������ ����ä�ù�");
		jta = new JTextArea();
		jp = new JPanel();	
		jf = new JTextField(20);
		jbt = new JButton("����");
		jbt.addActionListener(this);
		jp.add(jf);
		jp.add(jbt);
		add(jta,"Center");
		add(jp,"South");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	///////////////////////////////////////////////////
		Thread  thread = new Thread(this);
		thread.start();
	//////////////////////////////////////////////////		
	}
	public static void main(String[] args) 
	{
		new Client();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		Object obj = arg0.getSource();
		
		if(obj==jbt)
		{
			try 
			{
				dos.writeUTF(jf.getText().toString());
				jta.setText("��: "+jf.getText()+"\n"+ jta.getText());
				jf.setText("");
			}
			 catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	@Override
	public void run() 
	{
		// �������� �����ϰ�, ���� �޼��� �о�ͼ� ����ϱ�
		try 
		{
			sock = new Socket("172.17.210.102",5000);
			System.out.println("���� ���� ����");
			dos = new DataOutputStream(sock.getOutputStream());
			dis =  new DataInputStream(sock.getInputStream());
			
			while(true)
			{
				String msg = dis.readUTF().toString();
				jta.setText("����: " +msg+"\n" +jta.getText());
				System.out.println("Message: "+msg);
			}	
		}  catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
