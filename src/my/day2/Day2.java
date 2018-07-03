package my.day2;
import java.util.Scanner;

public class Day2 {
	private static String name;
	private static Scanner scanner;
	public static void main(String[] args) { 
		scanner = new Scanner(System.in);
		System.out.println("학번");
		int i = scanner.nextInt();
		// 이름을 입력하세요.라는 문자열 출력하기
		// 스캐너 객체를 이용히여 이름을 입력받아오기
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("학번:" + i);
		System.out.println("이름:" + name);
	}
}
