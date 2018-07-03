package my.day2;

public class Random {
	private static double a;

	public static void main(String[] args) { 
		a = Math.random();
		int b= (int)(Math.random()* 100);
		System.out.println("컴퓨터가 생성한 난수" + b);
	}
}

