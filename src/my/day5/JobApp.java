package my.day5;

import java.util.*;

public class JobApp 
	{
	//멤버 변수로 2개를 정의
	String name;
	int age;
	
	private static Scanner scan;
	private static Scanner scan2;

	public void showMenu()
	{ 
		System.out.println("---------Job v 1.0---------\n");
		System.out.println("1. 구직등록");
		System.out.println("2. 구직등록");
		System.out.println("3. 구직자 정보 출력");
		System.out.println("4. 구인회사 정보 출력");
		System.out.println("5. 종료\n");
		System.out.println("메뉴를 선택하세요=>");
		System.out.println("---------------------------");	
	}
	
	public void inputP()
	{
		person p = new person();
		scan = new Scanner(System.in);
		System.out.println("구직 등록 시작");
		System.out.println("이름을 입력하세요=>");
		String name = scan.next();
		p.setName(name);
		System.out.println("나이를 입력하세요=>");
		p.setAge(scan.nextInt());
		String info = p.showProfile();
		System.out.println(info);
	}
	public person[] addperson()
	{
		person[] p = new person[10];
		for(int i =0; i<p.length; i++) 
		{ 
			p[i] = new person(name, age);
		}
		return p;
	}
	
	public static void main(String[] args)
	{
		JobApp job = new JobApp();
		job.showMenu();
		scan2 = new Scanner(System.in);
		while(true)
		{ 
			job.showMenu();
			int no= scan2.nextInt();
			if(no==5)
			{
				System.exit(0); //정상종료 1비정성종료
			}
			else if(no==1)
			{ 
				job.inputP();	
			}
		}			
	}
}
