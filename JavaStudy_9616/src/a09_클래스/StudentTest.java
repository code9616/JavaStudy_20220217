package a09_클래스;

/**
 * Student(클래스)
 * 속성
 * schoolName
 * studentYear
 * studentGroup
 * studentnumber
 * studentName
 * studentAddress
 * studentphone
 * graduationFlag(boolean)
 * 
 * 기능(메서드)
 * showStudentInfo()
 * 학교명 : 부산고등학교
 * 학년 : 3
 * 반 : 2
 * 번호 : 10
 * 이름 : 김지훈
 * 주소 : 부산 수영구
 * 연락처 : 010-2434-9616
 * 졸업구분 : 재학중 [true(졸업), false(재학중)];
 * 
 * incrementYear()
 * 학년 + 1
 * 학년 3학년을 넘어서면 graduationFlag = true;
 */
public class StudentTest {
	
	

	public static void main(String[] args) {
		Student s1 = new Student("부산고등학교", 1 ,2, 10, "김지훈", "부산 수영구", "01024349616", false);
//		s1.schoolName = "부산고등학교";
//		s1.studentYear = 1;
//		s1.studentGroup = 2;
//		s1.studentnumber = 10;
//		s1.studentName = "김지훈";
//		s1.studentAddress = "부산 수영구";
//		s1.studentphonenumber = "01024349616";
//		s1.graduationFlag = false;
		
		s1.incrementYear();
		s1.incrementYear();
		s1.incrementYear();
		s1.showStudentInfo();

		Student s2 = new Student("경남고등학교", "김지훈");
		s2.incrementYear();
		
				
		
	}

}
