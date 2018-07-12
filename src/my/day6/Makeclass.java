package my.day6;

public class Makeclass 
{
	private int age;
	private int height;
	private int weight;
	private String phonNum;
	private static Makeclass d;
	
	public Makeclass() 
	{ 	
	}
	//昔切 持失切
	public Makeclass(int age, int height, int weight, String phonNum) 
	{
		this.setAge(age);
		this.height= height;
		this.weight= weight;
		this.setPhonNum(phonNum);
	}
	//持失切拭辞 持失切 this() 
	public Makeclass(int age, int height, int weight) 
	{
		this.setAge(age);
		this.height= height;
		this.weight= weight;
	}
	public double A() 
	{
		double b =weight /((height/100.)*(height/100.));
		return b;
	}
	public static void main(String[] aegs) { 
		Makeclass d = new Makeclass(25, 178, 60, "010-7751-2790");
		System.out.println(d.A());
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getPhonNum() 
	{
		return phonNum;
	}
	public void setPhonNum(String phonNum) 
	{
		this.phonNum = phonNum;
	}
	public static Makeclass getD() {
		return d;
	}
	public static void setD(Makeclass d) {
		Makeclass.d = d;
	}
}
