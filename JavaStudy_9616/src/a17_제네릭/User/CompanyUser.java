package a17_제네릭.User;

import a13_인터페이스2.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyUser extends User{
	
	
	
	public CompanyUser(String username, String password, String name, String email, String businessNumber) {
		super(username, password, name, email);
		this.businessNumber = businessNumber;  //부모데이터를 받아서 생성하라
	}

	private String businessNumber;
}
