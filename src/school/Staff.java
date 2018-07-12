package school;

import java.util.*;

public class Staff extends Person {

	private String id; // ���
	private String dept; // �μ�

	// setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// ���� ���� �Է� ����
	public void inputInfo() {
		// �̸�, �ּ� �Է¹޴� ���� �θ� ��
		super.inputInfo();
		// �߰� �� �Ӽ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �Է��ϼ��� => ");
		String h = sc.nextLine();
		setId(h);
		System.out.println("�μ��� �Է��ϼ��� => ");
		String hg = sc.nextLine();
		setDept(hg);
	}

	public String getInfo() {
		String info = super.getInfo() + "\n���: " + id + "\n�μ�: " + dept;
		return info;
	}
}
