package my.day10;
//������ �ܾ� �о����(���Ͽ� �ִ� �ܾ� �ƹ��ܾ ������ �ϱ����� ����Ŭ�������)

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Words 
{
	Random radom;
	String[] words;
	static final int MAX = 100; // ������� ����
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
