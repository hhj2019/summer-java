package my.day2;

public class Random {
	private static double a;

	public static void main(String[] args) { 
		setA(Math.random());
		int b= (int)(Math.random()* 99) + 1;
		System.out.println("��ǻ�Ͱ� ������ ����" + b);
	}

	public static double getA() {
		return a;
	}

	public static void setA(double a) {
		Random.a = a;
	}
}

