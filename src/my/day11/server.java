package my.day11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP ��Ź�Ŀ��� ���� ���α׷� �ۼ�

public class server 
{
	public static void main(String[] args) 
	{
		//port 
		int port = 4444;
		try 
		{
			ServerSocket ser = new ServerSocket(port);
			System.out.println("���� �����......");
			Socket soc = ser.accept();
			InputStream is = soc.getInputStream();
			System.out.println("Ŭ���̾�Ʈ �����......");
			System.out.println("Ŭ���̾�Ʈ�� IP: " +  soc.getInputStream());
			OutputStream os = soc.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("�ȳ�......");
			dos.writeInt(100);
			dos.flush();
			dos.close();
			ser.close();
			
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
