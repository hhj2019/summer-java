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
				System.out.println("범위밖의 수를 입력했습니다 다시 입력해주세요");
				i = sc.nextInt();
			}
			count++;
			if (i > num) {
				System.out.println("보다 작음");
			}
			else if (i < num) {
				System.out.println("보다 큼");
			}
		}
		System.out.println("컴퓨터가 생성한 난수" + num +"\n" + count + "회 걸렸습니다.");
	}
}

