package school;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolApp {

	private Person[] p = new Person[30]; // 30�� ����
	private int count; // �迭�� �ε����� ���� ����

	public Person[] getP() {
		return p;
	}

	public int getCount() {
		return count;
	}

	/** ���� �޴��� �����ִ� �޼ҵ� * */
	public void mainMenu() {
		out.println("---------------Main Menu--------------");
		out.println("|1. ���  2. �˻� 3. ���� 4.��� 5. ����|");
		out.println("--------------------------------------");
		out.println("��ȣ�� �Է��ϼ���=>");
		out.println("--------------------------------------");
	}// ----------

	/** ���� �޴��� �����ִ� �޼ҵ� * */
	public void subMenu() {
		out.println("---------------Sub Menu--------------");
		out.println("| 1.�л�  2. ���� 3. ���� 4. �����޴�  |");
		out.println("--------------------------------------");
		out.println("��ȣ�� �Է��ϼ���=>");
		out.println("--------------------------------------");
	}

	/** ���� �޴� ���...���̽� ���� ���� ���� **/
	public void register() {
		Scanner sc = new Scanner(System.in);
		outer: // ���̺��
		while (true) {
			subMenu();
			int no = 0;
			try {
				no = sc.nextInt();
			} catch (InputMismatchException e) {
				out.println("���ڷ� �Է��ؾ� �ؿ�!");
				return;
			}
			switch (no) {
			case 1: // �л�
				Student st = new Student();
				st.inputInfo(); // �л������� �Է¹���.
				addPerson(st); // ��ü�� �迭�� �����Ѵ�.
				break;
			case 2: // ����
				Teacher tc = new Teacher();
				tc.inputInfo();
				addPerson(tc);
				break;
			case 3: // ����
				Staff sf = new Staff();
				sf.inputInfo();
				addPerson(sf);
				break;
			case 4: // ���� �޴�
				break outer; // ���̺� ������ �ݺ����� ��Ż
			// return;
			// register()�޼ҵ带 ȣ���� ������ ������� �ѱ�
			default:
				out.println("�������� �ʴ� �޴���ȣ�Դϴ�.");
			}
		} // while----
	}// register()------------------

	/** ����� ������� �迭�� �����ϴ� �޼ҵ� */
	public void addPerson(Person person) {
		if (count < p.length) {
			p[count++] = person;
		} else {
			out.println("30�� ���� �ʰ� �Ǿ����!");
		}
	}// addPerson()------------

	/** �̸����� ��ϵ� ��� �˻��ϴ� �޼ҵ� */
	public String findPerson(String name) {
		for (int i = 0; i < count; i++) {
			String pname = p[i].getName(); // �迭�� ����� ����� �̸��� �����´�.

			if (name.equals(pname)) { // �˻��ϴ� ����� �̸��� �迭���� �����̸��� �����ϴٸ�
				p[i].printAll(); // �� ��� ���� ���
				return p[i].getInfo(); // awt�� �����ϱ� ���� ���ڿ��� ������ ��ȯ
			} // if-------------
		} // for----------
		out.println(name + "�̶� ��� �����!");
		return name + "�̶� ��� �����";

	}// findPerson()---------------

	/** �̸����� �����ϴ� �޼ҵ� */
	public String removePerson(String name) {
		for (int i = 0; i < count; i++) {
			String pname = p[i].getName();
			if (name.equals(pname)) {
				for (int j = i; j < count; j++) {
					p[j] = p[j + 1];
				} // for----
				count--; // �迭 �ε��� �ϳ� ����.
				out.println(name + "�� ������ �����ƾ��!");
				return name + "�� ���� ����";
			} // if-------
		} // for---
		out.println(name + "���� �����!");
		return name + "�� �����!";

	}// removePerson()-------------

	/* �迭�� ����� ����� ��� ���� ��� */
	public String printAll() {
		String str = "";
		for (int i = 0; i < count; i++) {
			if (p[i] instanceof Student) {
				str += "\n---�л�����---\n";
			} else if (p[i] instanceof Teacher) {
				str += "\n---��������---\n";
			} else {
				str += "\n---��������---\n";
			}
			str += p[i].getInfo();
		}
		out.println(str);
		return str;
	}// printAll()-------

	public static void main(String[] args) {
		SchoolApp sa = new SchoolApp();
		Scanner sc = new Scanner(System.in);
		while (true) {
			sa.mainMenu();
			// �޴� ��ȣ �Է�
			int no = 0;
			try {
				no = sc.nextInt();
			} catch (InputMismatchException e) {
				out.println("���ڷ� �Է��ؾ� �ؿ�");
				return;
			}
			switch (no) {
			case 1: // ���
				sa.register();
				break;
			case 2: // �˻�
				out.println("�˻��� ��� �̸�=>");
				String name = sc.next();
				out.println("--" + name + "���� �˻��մϴ�.--");
				sa.findPerson(name);
				break;
			case 3: // ����
				out.println("������ ��� �̸�=>");
				name = sc.next();
				sa.removePerson(name);
				break;
			case 4: // ���
				sa.printAll();
				break;
			case 5: // ����
				out.println("Bye Bye~~");
				System.exit(0);
			}
		}
	}
}