package my.day5;

import java.util.*;

public class JobApp 
	{
	//��� ������ 2���� ����
	String name;
	int age;
	
	private static Scanner scan;
	private static Scanner scan2;

	public void showMenu()
	{ 
		System.out.println("---------Job v 1.0---------\n");
		System.out.println("1. �������");
		System.out.println("2. �������");
		System.out.println("3. ������ ���� ���");
		System.out.println("4. ����ȸ�� ���� ���");
		System.out.println("5. ����\n");
		System.out.println("�޴��� �����ϼ���=>");
		System.out.println("---------------------------");	
	}
	
	public void inputP()
	{
		person p = new person();
		scan = new Scanner(System.in);
		System.out.println("���� ��� ����");
		System.out.println("�̸��� �Է��ϼ���=>");
		String name = scan.next();
		p.setName(name);
		System.out.println("���̸� �Է��ϼ���=>");
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
				System.exit(0); //�������� 1����������
			}
			else if(no==1)
			{ 
				job.inputP();	
			}
		}			
	}
}
