package my.day5;

public class person
{
	private String name;
	private int age;
	
	//기본 생성자 매소드 *따로 정의하지 않아도 생성이 된다. 
	public person() { 
		
	}
	//2개의 데이터를 갖는 생성자 메소드 정의 
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
		String info ="---" + name + "프로필---";
		info+= "\n 나이:" + age;
		return info;
		
	}
}

