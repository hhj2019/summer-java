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
			System.out.println("���Ἲ��.......");
			InputStream is = soc.getInputStream();
			//������Ÿ�Կ� �°��ϴ� ��ɾ� 
			DataInputStream dis = new DataInputStream(is);
			String data =dis.readUTF();
			System.out.println("����������->>>>>>"+ data);
			int result = dis.readInt();
			System.out.println("����������->>>>>>"+ result);
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
