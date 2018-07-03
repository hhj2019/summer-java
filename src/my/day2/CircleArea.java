package my.day2;
import java.util.Scanner;
public class CircleArea {
	private static Scanner scanner;
	public static void main(String[] args) { 
		scanner = new Scanner(System.in);
		System.out.println("원의 반지름:");
		double i = scanner.nextDouble();
		System.out.println("면적은\n" + (i * i * 3.14 ));			
 }
}

