package my.day10;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class File2 
{

	private static OutputStream os;

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		try
		{
			os = new FileOutputStream ("Test.txt");
			String str = "날씨가 좋다";
			byte[] bi = str.getBytes();
			os.write(bi);
			
		} catch (Exception e)
		{
			System.out.println("파일이 없습니다.");	
		} 	finally 
		{
			try {
				FileOutputStream os = null;
				if(os!=null) 
					os.close();				
			} catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
	}
}
