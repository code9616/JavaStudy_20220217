package a09_클래스;

public class Computer {
	String model;
	
	
	public Computer() { //생성자 + Computer           린턴할게 없는게 아니라 생략된 것이다  //생성자의 return 값은 모조건 주소값이다.
		System.out.println("컴퓨터 객체를 생성합니다");
	}
	
	public void printInfo() {
		System.out.println("컴퓨터 모델: " + model);
	}
}
