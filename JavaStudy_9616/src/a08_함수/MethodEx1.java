package a08_함수;

public class MethodEx1 { 
//메소드는 class 안에 만들어야함!
	
	public static int  outputNumber() {
		return 10;
	}
	
	public static void showName() { // return 타입이 있으면 값이 없다는 것, void 값이 없으므로 간순하게 실행되는 용도
		String name = "김지훈";
		System.out.println("이름: " + name);
	}
	
	public static int outputNumber2(int number) { //매개변수 선언
		return number;
	}
	
	public static int outputNumber3(int number) {
		if(number % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void showName2(String name) {
		if(name == null) {
			return;
		}
		System.out.println(name);
	}
	
	public static void main(String[] args) { //main이 시작점
		int number = outputNumber();
		System.out.println(number);
		showName();
		if(number == 10) {
			return;
		}
		showName2(null);
		int number2 = outputNumber2(100);
		System.out.println(number2);

	}

}
