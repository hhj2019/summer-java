package my.day2;
import java.util.Random;
import java.util.Scanner;

public class WhileNumber {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Random rand = new Random();
		int num = rand.nextInt(100);
		int count = 1;
		
		while(true) { 
			System.out.print("0�� 100������ ���ڸ� �Է��ϼ���\n");
			int a= sc.nextInt();
			if(a >=0 && a <=100) {
				if(a == num) {
					System.out.println(count +"���� ���߼̽��ϴ�.");
				break; 
				}else {
					count++;
					if(a < num) {
						System.out.println(a +"�������� �۽��ϴ�.");
					} 
					else 
					{
						System.out.println(a +"�������� Ů�ϴ�.");
					}
				}
			}
		}
	}
}
