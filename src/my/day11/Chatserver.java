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
			System.out.println("서버 대기중.......");
			sock= soc.accept();
			System.out.println("클라이언트 연걸 성공......");
			//스트림 연걸 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//클라이언트에게 메세지 전송을 위힌 출력 스트림 연걸
			PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
			String msg= "";
			//스레드 생성
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
	// 클라이언트가 보낸 메시지를 자신의 콘솔 창에 출력하기 
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
