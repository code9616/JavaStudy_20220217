package a09_클래스_정보은닉;

public class EncapsulationTest {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation("jihun", "1234", "kakao");
		encapsulation.showInfo();
		
		encapsulation.setUsername("jihun1111");
		String username = encapsulation.getUsername();
		System.out.println(username);
	}

}
