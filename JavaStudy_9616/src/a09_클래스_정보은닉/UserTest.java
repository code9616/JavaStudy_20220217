package a09_클래스_정보은닉;

public class UserTest {

	public static void main(String[] args) {
		User user = new User("shipji", "1234", "김지훈", "2001lion@naver.com");
//		user.setUsername("shipji");
//		user.setPassword("1234");
//		user.setName("김지훈");
//		user.setEmail("2001lion@naver.com");
//		
		
//		String username = user.getUsername(); 메모리 낭비;;
//		String password = user.getUsername();
//		String name = user.getUsername();
//		String email = user.getUsername();
//		
		System.out.println("아이디: " + user.getUsername());
		System.out.println("비밀번호: " + user.getPassword());
		System.out.println("이름: " + user.getName());
		System.out.println("이메일: " + user.getEmail());
		

		

	}

}
