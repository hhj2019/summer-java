package my.day11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP 통신방식에서 서버 프로그램 작성

public class server 
{
	public static void main(String[] args) 
	{
		//port 
		int port = 4444;
		try 
		{
			ServerSocket ser = new ServerSocket(port);
			System.out.println("한조 대기중......");
			Socket soc = ser.accept();
			InputStream is = soc.getInputStream();
			System.out.println("클라이언트 연결됨......");
			System.out.println("클라이언트의 IP: " +  soc.getInputStream());
			OutputStream os = soc.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("안녕......");
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
