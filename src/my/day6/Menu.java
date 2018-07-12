package my.day6;
//추상클래스 
public abstract class Menu 
{
	//추상 메소드 
	abstract public void 김치찌개();
	abstract public void 부대찌게();
	abstract public void 비빕밥();
	abstract public void 순대국();
	abstract public void 공기밥();
	//정상 메소드
	final public void 밥() 
	{
		System.out.println("밥입니다");
	}
}