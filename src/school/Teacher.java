package school;

import java.util.*;

public class Teacher extends Person {
	private String id; // 교번
	private String subject; // 담당 과목

	// setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 교사 정보 입력 받음
	public void inputInfo() {
		// 이름, 주소 입력받는 것은 부모 것
		super.inputInfo();
		// 추가 된 속성 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("교번을 입력하세요 => ");
		String h = sc.nextLine();
		setId(h);
		System.out.println("담당 과목을 입력하세요 => ");
		String hg = sc.nextLine();
		setSubject(hg);
	}

	// @Overriding 교사정보 출력
	public String getInfo() {
		String info = super.getInfo() + "\n교번: " + id + "\n담당과목: " + subject;
		return info;
	}
}
