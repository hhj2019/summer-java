package my.day5;

public class InstituteApp {
	public static void main(String[] args) 
	{
		Student stu = new Student();
		stu.setName("������");
		stu.setNo(20131634);
		stu.setCname("�ڹ�");
		
		Student stu2 = new Student();
		stu2.setName("����������");
		stu2.setNo(20131641);
		stu2.setCname("�ڹ���");
		
		Teacher tea= new Teacher();
		tea.setName("�����Ծ�");
		tea.setNo(20131634);
		tea.setSubject("�ڹ�");
		
		Staff stf = new Staff();
		stf.setName("�̽�����");
		stf.setNo(19940000);
		stf.setDept("���");
		
		Human arrHuman[]= new Human[4];
		arrHuman[0] = stu;
		arrHuman[1] = tea;
		arrHuman[2] = stu2;
		arrHuman[3] = stf;
		
		
		for(int i=0; i<arrHuman.length; i++)
		{
			System.out.println("�̸�:" + arrHuman[i].getName());
			System.out.println("�й�:" + arrHuman[i].getNo());
		}
	}

}
