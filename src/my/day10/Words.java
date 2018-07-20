package my.day10;
//임의의 단어 읽어오기(파일에 있는 단어 아무단어나 나오게 하기위해 랜덤클래스사용)

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Words 
{
	Random radom;
	String[] words;
	static final int MAX = 100; // 상수변수 선언
	int len;
	
	public void words() throws Exception 
	{
		radom =new Random();
		words = new String[MAX];
		Scanner s = new Scanner(new BufferedReader(new FileReader("data.txt")));
		
		int i;
		for(i=0; i<MAX; i++) 
		{
			if(s.hasNext()== false)
			{
				break;
			}
			words[i] = s.next();
		}
		len = i;
	}
	public String getWords() 
	{
		return words[radom.nextInt(len)];
	}
}
