package my.day5;

public class InstituteApp {
	public static void main(String[] args) 
	{
		Student stu = new Student();
		stu.setName("윤석규");
		stu.setNo(20131634);
		stu.setCname("자바");
		
		Student stu2 = new Student();
		stu2.setName("압정꼭지후");
		stu2.setNo(20131641);
		stu2.setCname("자바임");
		
		Teacher tea= new Teacher();
		tea.setName("윤석규씨");
		tea.setNo(20131634);
		tea.setSubject("자바");
		
		Staff stf = new Staff();
		stf.setName("이승현씨");
		stf.setNo(19940000);
		stf.setDept("산단");
		
		Human arrHuman[]= new Human[4];
		arrHuman[0] = stu;
		arrHuman[1] = tea;
		arrHuman[2] = stu2;
		arrHuman[3] = stf;
		
		
		for(int i=0; i<arrHuman.length; i++)
		{
			System.out.println("이름:" + arrHuman[i].getName());
			System.out.println("학번:" + arrHuman[i].getNo());
		}
	}

}
