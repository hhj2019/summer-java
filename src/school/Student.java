package school;

import java.util.*;

public class Student extends Person {
	private String id; // �й�
	private String className; // �б�

	// setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	// @Overriding �л����� ���(�̸�, �ּҴ� �θ��� Person �� ȣ���� ��
	public String getInfo() {
		String info = super.getInfo() + "\n�й�: " + id + "\n�б�: " + className;
		return info;
	}

	// �л� ���� �Է� ���� @Overriding
	public void inputInfo() {
		// �̸�, �ּ� �Է¹޴� ���� �θ� ��
		super.inputInfo();

		// �߰��� �Ӽ�(�й�, �б�) �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�й��� �Է��ϼ��� => ");
		String h = sc.nextLine();
		setId(h);
		System.out.println("�б��� �Է��ϼ��� => ");
		String hg = sc.nextLine();
		setClassName(hg);
	}
}
