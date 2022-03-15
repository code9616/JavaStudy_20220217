
package a17_제네릭;

import a13_인터페이스2.model.User;

public class GenericTest {

	public GenericEx<String> getExData(String data) {
		GenericEx<String> ex = new GenericEx<String>(data);
		return ex;
	}	//static이 아니기에 메모리 생성이 필요하다. ex) a08_5 예제를 보면 static으로 설정했기에 클래스에서 공유가 가능하다.
	public GenericEx<User> getExData(User data) {
		GenericEx<User> ex = new GenericEx<User>(data);
		return ex;
	}
	
	public static void main(String[] args) {
		GenericTest genericTest = new GenericTest();  //따라서 인스턴스화 시켜야지 heap메모리에 할당한다.
		GenericEx<String> ex = genericTest.getExData("100");  //Data에 String 넘어감
		GenericEx<User> ex2 = genericTest.getExData(new User("jihun", "1234", "김지훈", "2@naver.com"));  //Data에 User객체가 넘어감
		System.out.println(ex);
		System.out.println(ex2);
		
	}

}
