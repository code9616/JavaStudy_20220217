package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String, Student>());
		
		service.showStudentAll();
		
		service.addStudent("김지훈", "aaa.naver.com", "부산 수영구");
		service.addStudent("유민혁", "bbb.naver.com", "부산 연제구");
		service.addStudent("서원대", "ccc.naver.com", "부산 부산진구");
		service.showStudentAll();
		
		service.updateStudentByName("김지훈", "ddd@kakao.com", null);
		service.showStudentByName("김지훈");
		
		service.deleteStudentByName("유민혁");
		service.showStudentByName("김지훈");
	}

}
