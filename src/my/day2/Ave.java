package my.day2;

import java.util.Scanner;

public class Ave {
	private static Scanner scanner;
	public static void main(String[] args) { 
		scanner = new Scanner(System.in);
		System.out.println("��������:");
		double i = scanner.nextDouble();
		
		System.out.println("��������:");
		double a = scanner.nextDouble();
		
		System.out.println("��������:");
		double b = scanner.nextDouble();
		
		double avg = (i + a + b) /  3;
		System.out.println("��� ������? "  + avg);	
		
		if(i > avg) {
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		else if(i < avg) {
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		else {
			System.out.println("����� ����Դϴ�");
		}
		if(a > avg) {
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		else if(a < avg) {
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		else {
			System.out.println("���д� ����Դϴ�");
		}
		if(b > avg) {
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		else if(b < avg) {
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		else {
			System.out.println("����� ����Դϴ�");
		}													
 }
} 
