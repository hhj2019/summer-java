package my.day5;

public class person
{
	private String name;
	private int age;
	
	//�⺻ ������ �żҵ� *���� �������� �ʾƵ� ������ �ȴ�. 
	public person() { 
		
	}
	//2���� �����͸� ���� ������ �޼ҵ� ���� 
	public person(String name, int age) 
	{
		this.name =name; 
		this.age= age;
		
	}


	public String getName()
	{ 
		return name;
	}
	public void setName(String name) 
	{
		this.name = name; 
	}
	public void getAge(int age)
	{ 
		this.age = age;
	}
	public void setAge(int age)
	{ 
		this.age = age;
	}
	public String showProfile()
	{ 
		String info ="---" + name + "������---";
		info+= "\n ����:" + age;
		return info;
		
	}
}

