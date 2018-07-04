package my.day3;

public class Arr1 {
	public static void main(String[] args) {
		String[] a = {"Hello", "Network", "Progeamming", "Good!"};
	 	
		for(int i=0; i<a.length; i++) { 
			System.out.println(" a[" + i + "]=\t" + a[i]);
			
		}
		a[0] = "Hi0";
		a[1] = "Hi1";
		a[2] = "Hi2";
		a[3] = "Hi3";
	
		for(int i=0; i<a.length; i++) { 
			System.out.println(" a[" + i + "]=\t" + a[i]);
		
		}
	}
}


