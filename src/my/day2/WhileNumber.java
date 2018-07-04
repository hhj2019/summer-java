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
			System.out.print("0과 100사이의 숫자를 입력하세요\n");
			int a= sc.nextInt();
			if(a >=0 && a <=100) {
				if(a == num) {
					System.out.println(count +"번에 맞추셨습니다.");
				break; 
				}else {
					count++;
					if(a < num) {
						System.out.println(a +"난수보다 작습니다.");
					} 
					else 
					{
						System.out.println(a +"난수보다 큽니다.");
					}
				}
			}
		}
	}
}
