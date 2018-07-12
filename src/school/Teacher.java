package school;

import java.util.*;

public class Teacher extends Person {
	private String id; // ����
	private String subject; // ��� ����

	// setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// ���� ���� �Է� ����
	public void inputInfo() {
		// �̸�, �ּ� �Է¹޴� ���� �θ� ��
		super.inputInfo();
		// �߰� �� �Ӽ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� => ");
		String h = sc.nextLine();
		setId(h);
		System.out.println("��� ������ �Է��ϼ��� => ");
		String hg = sc.nextLine();
		setSubject(hg);
	}

	// @Overriding �������� ���
	public String getInfo() {
		String info = super.getInfo() + "\n����: " + id + "\n������: " + subject;
		return info;
	}
}
