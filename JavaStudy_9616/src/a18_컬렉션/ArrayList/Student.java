package a18_컬렉션.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //기본생성자
@NoArgsConstructor	//전체생성자
@Builder
public class Student {
	/*
	 * studentName
	 * studentEmail
	 * studentAddress
	 * 
	 */
	
	
	private String name;
	private String email;
	private String address;
}
