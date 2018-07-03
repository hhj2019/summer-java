package my.day2;
import java.util.Scanner;

public class For {
	private static Scanner scanner;
	public static void main(String[] args) { 
		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum1 = 0;
		
	    int result = a % 2;
	    
	    if (result == 0) { 
	    	for (int i = 1; i < a + 1; i++) { 
	    		sum1 += i;		
			/*switch (result) { 
			case 0 :
				sum1 += i;
				break;
			case 1 : 
				sum2 += i;
				break;
			default : 
				System.out.println("값없음" + i);
				break;
			}*/
	    	}
	    	System.out.println("1부터 a 까지의 합" + sum1);
	    }
	    else {
	    	System.out.println("a는 홀수 입니다");	
	    }
	}
}
