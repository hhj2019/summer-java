package my.day2;
import java.util.Scanner;

public class Day2 {
	private static String name;
	private static Scanner scanner;
	public static void main(String[] args) { 
		scanner = new Scanner(System.in);
		System.out.println("�й�");
		int i = scanner.nextInt();
		// �̸��� �Է��ϼ���.��� ���ڿ� ����ϱ�
		// ��ĳ�� ��ü�� �̿����� �̸��� �Է¹޾ƿ���
		System.out.println("�̸��� �Է��ϼ���");
		name = scanner.next();
		System.out.println("�й�:" + i);
		System.out.println("�̸�:" + name);
	}
}
