package my.day2;
import java.util.Random;


public class Number {
	public static void main(String[] args) { 
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("컴퓨터가 생성한 난수" + num);

	}
}
