package my.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Chatserver implements Runnable
{
	Socket sock;
	
	public Chatserver() 
	{
		try 
		{
			ServerSocket soc = new ServerSocket(4444);
			System.out.println("���� �����.......");
			sock= soc.accept();
			System.out.println("Ŭ���̾�Ʈ ���� ����......");
			//��Ʈ�� ���� 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//Ŭ���̾�Ʈ���� �޼��� ������ ���� ��� ��Ʈ�� ����
			PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
			String msg= "";
			//������ ����
			Thread t = new Thread(this);
			t.start();
			
			while((msg = br.readLine())!= null) 
			{
				pw.println(msg);
			}
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		new Chatserver();
	}
	@Override
	public void run() 
	{
	// Ŭ���̾�Ʈ�� ���� �޽����� �ڽ��� �ܼ� â�� ����ϱ� 
	try 
	{
		InputStream is = sock.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while(true) {	
			String clientMsg = br.readLine();
			System.out.println("Form Client->>>>>>" + clientMsg);
		}
	} catch (IOException e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		}	
		
	}//run()--

}
