package my.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient implements Runnable 
{
	String ip;
	Socket sock;
	int port = 0;

	public ChatClient() 
	{
		String ip = "DESKTOP-J99F7FO";
		try 
		{
			sock = new Socket();
			System.out.println(new InetSocketAddress(ip, port));
			
			sock.connect(new InetSocketAddress(ip, port));
			System.out.println(sock.getInetAddress());
			System.out.println("연결 성공......");
			// 스트림 연걸
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// 서버로 데이터 전송
			PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
			String msg = "";
			// 스레드 생성
			Thread t = new Thread(this);
			t.start();
			// 클라이언트
			while ((msg = br.readLine()) != null) 
			{
				pw.println(msg);

			}
		} catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) 
	{
		new ChatClient();
	}

	@Override
	public void run() 
	{
		// 서버가 보낸 메시지를 자신의 콘솔 창에 출력하기
		try {
			InputStream is = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String clientMsg = "";
			while (true) 
			{
				clientMsg = br.readLine();
				System.out.println("Form Client->>>>>>" + clientMsg);
			}
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// run()--
}
