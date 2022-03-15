
package a17_제네릭;

import a17_제네릭.User.CompanyUser;
import a13_인터페이스2.model.User;
import a17_제네릭.User.PersonalUser;

public class ControllerTest {
	
	public CMRespDto<? extends User> getProfile(String username){  // 클래스 내부를 내가원하는 타입으로 바꿀수 있다. 상속받은 무언가만 받을 수 있다.
		PersonalUser personalUser = new PersonalUser("jihun", "1234", "김지훈", "2@naver.com", "a20220001");
		CompanyUser companyUser = new CompanyUser("apple", "1111", "애플", "apple@gmail.com", "220-81-47821");
		if(username.equals(personalUser.getUsername())) {
			return new CMRespDto<PersonalUser>(1, "개인회원프로필", personalUser);
		}else if(username.equals(personalUser.getUsername())) {
			return new CMRespDto<CompanyUser>(1, "기업회원프로필", companyUser);
		}else {
			return new CMRespDto<User>(-1, "프로필로드 실패", new User());
		}
	}
	// <?> 와일드카드 : 생성되는 자료형에 따라서 자료형이 달라진다.
	public CMRespDto<?> login(String username, String password){
		User userEntity = User.builder()
								.username("jihun")
								.password("1234")
								.name("김지훈")
								.email("2@naver.com")
								.build();
		User user = new User("jihun", "1234", null, null);
								
		if(userEntity.getUsername().equals(username)) {
			if(userEntity.getPassword().equals(password)) {
				return new CMRespDto<User>(1, "로그인 성공", userEntity);	// 생성할때 자료형은 정확하게 주어야한다.
				
			}else {
				return new CMRespDto<String>(-1, "비밀번호가 틀렸습니다.", password);
			}
		}else {
			return new CMRespDto<String>(-1, "아이디가 틀렸습니다.", username);
		}
		
	}
	
	public static void main(String[] args) {
		ControllerTest test = new ControllerTest();
		System.out.println(test.login("jihun", "1234"));
		System.out.println(test.getProfile("jihun"));
		
		

	}

}
