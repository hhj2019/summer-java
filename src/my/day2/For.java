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
				System.out.println("������" + i);
				break;
			}*/
	    	}
	    	System.out.println("1���� a ������ ��" + sum1);
	    }
	    else {
	    	System.out.println("a�� Ȧ�� �Դϴ�");	
	    }
	}
}
