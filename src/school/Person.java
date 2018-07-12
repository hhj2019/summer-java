package school;

import java.util.Scanner;

public abstract class Person {
	private String name;
	private String addr;

	public Person() {
		super();
	} // �⺻������ ----

	public Person(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	} // ���ڻ����� ---------

	/* setter, getter */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	/* �߻�޼ҵ� = �޼ҵ��� BODY�� ���� �޼ҵ� */
	public abstract void setId(String id);

	public abstract String getId();

	// ��� ������ �Է¹޴� ���
	public void inputInfo() {
		System.out.println("�̸��� �Է��ϼ���=> ");
		Scanner sc = new Scanner(System.in);
		String nm = sc.nextLine();
		setName(nm); // ��� ������ �Է°��� ����
		System.out.println("�ּҸ� �Է��ϼ���=> ");
		String ad = sc.nextLine();
		setAddr(ad); // ��� ������ �Է°��� ����
	}

	// ��� ������ ���ڿ��� �����ִ� �޼ҵ�
	public String getInfo() {
		String info = "�̸�: " + name + "\n�ּ�: " + addr;
		return info;
	}

	// ��� ������ �ֿܼ� ������ִ� �޼ҵ�
	public void printAll() {
		System.out.println(this.getInfo());
	}

	// ����� �̸��� ��ȯ���ִ� �޼ҵ�
	public String toString() {
		return name;
	}
}
