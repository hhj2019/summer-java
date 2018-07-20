package my.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class File {

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		try {
			InputStream is =new FileInputStream("C:\\javaprogram\\20131647\\src\\my\\day10\\Test.txt");
		while(true) 
	{ 
			try 
			{ 
			int i = is.read();
			System.out.println(i);
			if(i==-1) break;
		} catch (IOException e) 
			{
			e.printStackTrace();
		}
	}
		} catch(FileNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("파일이 없습니다.");
		}
	}
}
