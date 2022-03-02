package a09_클래스;

public class CarTest {
/*
 * Car 클래스 정의
 * 속성(변수)
 * company
 * model
 * oil
 * 
 * 메서드
 * void go()
 * 기름 - 1;
 * 기름이 1 감소하였습니다.
 * 
 * void oiling()
 * 기름 + 1;
 * 기름이 1증가하였습니다.
 * 
 * void showCarInfo()
 * ㅇㅇㅇ회사에서 제조한 ㅇㅇㅇ차량의 정보입니다.
 * 현재 기름은 0000리터 입니다.
 * 
 * oil = 5
 * go();
 * 기름이 0보다 적으면 기름이 부족하여 차량의 이동이 불가능합니다.
 */
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.company = "KIA";
		c1.model = "carnival";
		c1.oil = 5;
		
		c1.showCarInfo();
		c1.go();
		c1.showCarInfo();
		c1.oiling();
		c1.oiling();
		c1.oiling();
		c1.oiling();
		c1.oiling();
		c1.showCarInfo();
		
		System.out.println();
		
		Car c2 = new Car();
		c2.company = "현대";
		c2.model = "아반떼";
		c2.oil = 5;
		
		c2.showCarInfo();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.showCarInfo();
		c2.oiling();
		c2.showCarInfo();
	}

}
