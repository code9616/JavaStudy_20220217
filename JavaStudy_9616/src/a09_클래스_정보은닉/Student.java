package a09_클래스_정보은닉;

public class Student {
		private String SchoolName;
		private String studentCode;
		private String studentYear;
		private String studentName;
		
		
		
		
		public Student(String schoolName, String studentCode, String studentYear, String studentName) {
			super();
			this.SchoolName = schoolName;
			this.studentCode = studentCode;
			this.studentYear = studentYear;
			this.studentName = studentName;
		}
		public String getSchoolName() {
			return SchoolName;
		}
		
		
		public void showInfo() {
			System.out.println("학교명: " + SchoolName);
			System.out.println("학번: " + studentCode);
			System.out.println("학년: " + studentYear);
			System.out.println("이름: " + studentName);
			System.out.println();
		}
		public String getStudentCode() {
			return studentCode;
		}
		public void setStudentCode(String studentCode) {
			this.studentCode = studentCode;
		}
		public String getStudentYear() {
			return studentYear;
		}
		public void setStudentYear(String studentYear) {
			this.studentYear = studentYear;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public void setSchoolName(String schoolName) {
			SchoolName = schoolName;
		}
		
		
}
		