package my.day2;
import java.util.Random;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		int num = rand.nextInt(100);
		int count = 1;
		
		for (int i = sc.nextInt(); i != num; i = sc.nextInt()) {
			for (int j = i; (j < 0)||(j > 100); j = i) {
				System.out.println("�������� ���� �Է��߽��ϴ� �ٽ� �Է����ּ���");
				i = sc.nextInt();
			}
			count++;
			if (i > num) {
				System.out.println("���� ����");
			}
			else if (i < num) {
				System.out.println("���� ŭ");
			}
		}
		System.out.println("��ǻ�Ͱ� ������ ����" + num +"\n" + count + "ȸ �ɷȽ��ϴ�.");
	}
}

