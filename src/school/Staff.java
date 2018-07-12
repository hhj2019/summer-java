package school;

import java.util.*;

public class Staff extends Person {

	private String id; // 사번
	private String dept; // 부서

	// setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// 직원 정보 입력 받음
	public void inputInfo() {
		// 이름, 주소 입력받는 것은 부모 것
		super.inputInfo();
		// 추가 된 속성 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("사번을 입력하세요 => ");
		String h = sc.nextLine();
		setId(h);
		System.out.println("부서를 입력하세요 => ");
		String hg = sc.nextLine();
		setDept(hg);
	}

	public String getInfo() {
		String info = super.getInfo() + "\n사번: " + id + "\n부서: " + dept;
		return info;
	}
}
