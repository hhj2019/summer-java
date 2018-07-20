package my.day10;

import java.io.BufferedReader;
import java.io.FileReader;


public class File4 
{

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		try {
			//FileReader is =new FileReader("C:\\javaprogram\\20131647\\src\\my\\day10\\Test.txt");
			BufferedReader br = new BufferedReader(new FileReader("Test.txt"));
			String c;  
	
		while((c= br.readLine())!=null) 
	{ 
			System.out.println(c);	
	}
		}catch (Exception e) 
		{
			System.out.println("파일이 없습니다.");	
		}
	}
}
		
			
	
