package my.day11;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class serverClient 
{
	public static void main(String[] args) 
	{
		String ip = "172.17.210.103";
		int port = 4444;
		try {
			Socket soc = new Socket(ip, port);
			System.out.println("연결성공.......");
			InputStream is = soc.getInputStream();
			//데이터타입에 맞게하는 명령어 
			DataInputStream dis = new DataInputStream(is);
			String data =dis.readUTF();
			System.out.println("서버로투터->>>>>>"+ data);
			int result = dis.readInt();
			System.out.println("서버로투터->>>>>>"+ result);
			is.close();
			soc.close();
			dis.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
