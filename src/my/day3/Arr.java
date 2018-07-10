package my.day3;

public class Arr {
	public static void main(String[] args) 
	{
		int[] a = { 10, 20, 30, 40, 50};
		int[] a1 = a;
		
		for(int i=0; i<a.length; i++) { 
			System.out.println(" a[" + i + "]=\t" + a[i]);
			System.out.println("a1[" + i + "]=\t" + a1[i]);	
		}
		a1[0] = 100;
		a1[1] = 200;
		a1[2] = 300;
		a1[3] = 400;
		a1[4] = 500;
		
		for(int i=0; i<a.length; i++) { 
			System.out.println(" a[" + i + "]=\t" + a[i]);
			System.out.println("a1[" + i + "]=\t" + a1[i]);		
		}
	}
}
