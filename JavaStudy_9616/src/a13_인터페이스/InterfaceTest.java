package a13_인터페이스;
/**
 * 
 * 인터페이스(Interface) 서로의 시스템을 교환
 * 규격, 약속
 * 인터페이스는 다중 구현이 가능하다.
 * 클래스는 다중 상속이 불가능하다.
 */
public class InterfaceTest {

	public static void main(String[] args) {
		PowerButton button = new RemoteControl();
		PowerButton button2 = new MonitorControl();
		
		PowerButton[] buttons = new PowerButton[2];
		
		buttons[0] = button;
		buttons[1] = button2;
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i].onClick();
			buttons[i].sendSignal();
			// ex
			/* 인터페이스만 같으면 제품(?)을 바꿔도 정상으로 작동함 */
			/* 자동차 바퀴 펑크가 나면 바퀴만 갈면 되는데 자동차와 바퀴가 일체형이면 전부 바꿔야하기 때문에 비효율적이다 
			 *  일체형이 아니라 분리형 객체 지향 프로그램을 만들어야함*/
		}
	}

}
