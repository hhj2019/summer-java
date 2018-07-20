package my.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class File3
{

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		try {
			FileReader is =new FileReader("C:\\javaprogram\\20131647\\src\\my\\day10\\Test.txt");
			int c;  
	
		while((c= is.read())!=-1) 
	{ 
			System.out.print((char)c );	
	
	}
		}catch (Exception e) 
		{
			System.out.println("파일이 없습니다.");	
			
		}
	}
}
		
			
	
