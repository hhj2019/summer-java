package my.day5;
public class  Student extends Human
{
	private String cname;

	public void setName(String n)
	{
		name=n;
	}
	public void setNo(int n){
		no=n;
	}
	public void setCname(String c)
	{
		cname=c;
	}

	public String getName()
	{
		return name;
	}
	public int getNo(){
		return no;
	}
	public String getCname()
	{
		return cname;
	}
	//�л������� ����ϴ� �޼ҵ�
	public void printInfo()
	{
		System.out.println("---�л� ����---");
		System.out.println("�̸�: "+name);
		System.out.println("�й�: "+no);
		System.out.println("�б�: "+cname);
	}

}////////////////////////////////