package my.day5;

public class HouseDog extends Dog
{
	public HouseDog() {
		super();
	}
	//sleep() �������̵�
	public void sleep() 
	{
		System.out.println(this.name +"\ntttttt");
		super.sleep();
	}
	public static void main(String[] args) 
	{
		HouseDog hdog= new HouseDog();
		hdog.SetName("poppy");
		hdog.sleep();
	}
}
