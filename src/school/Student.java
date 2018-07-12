package school;

import java.util.*;

public class Student extends Person {
	private String id; // 학번
	private String className; // 학급

	// setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	// @Overriding 학생정보 출력(이름, 주소는 부모인 Person 을 호출한 후
	public String getInfo() {
		String info = super.getInfo() + "\n학번: " + id + "\n학급: " + className;
		return info;
	}

	// 학생 정보 입력 받음 @Overriding
	public void inputInfo() {
		// 이름, 주소 입력받는 것은 부모 것
		super.inputInfo();

		// 추가된 속성(학번, 학급) 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력하세요 => ");
		String h = sc.nextLine();
		setId(h);
		System.out.println("학급을 입력하세요 => ");
		String hg = sc.nextLine();
		setClassName(hg);
	}
}
