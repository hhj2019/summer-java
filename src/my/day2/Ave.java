package my.day2;

import java.util.Scanner;

public class Ave {
	private static Scanner scanner;
	public static void main(String[] args) { 
		scanner = new Scanner(System.in);
		System.out.println("국어점수:");
		double i = scanner.nextDouble();
		
		System.out.println("수학점수:");
		double a = scanner.nextDouble();
		
		System.out.println("영어점수:");
		double b = scanner.nextDouble();
		
		double avg = (i + a + b) /  3;
		System.out.println("평균 점수는? "  + avg);	
		
		if(i > avg) {
			System.out.println("국어점수는 평균보다 높습니다");
		}
		else if(i < avg) {
			System.out.println("국어점수는 평균보다 낮습니다");
		}
		else {
			System.out.println("국어는 평균입니다");
		}
		if(a > avg) {
			System.out.println("수학점수는 평균보다 높습니다");
		}
		else if(a < avg) {
			System.out.println("수학점수는 평균보다 낮습니다");
		}
		else {
			System.out.println("수학는 평균입니다");
		}
		if(b > avg) {
			System.out.println("영어점수는 평균보다 높습니다");
		}
		else if(b < avg) {
			System.out.println("영어점수는 평균보다 낮습니다");
		}
		else {
			System.out.println("영어는 평균입니다");
		}													
 }
} 
