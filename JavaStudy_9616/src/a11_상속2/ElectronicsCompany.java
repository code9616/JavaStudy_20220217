package a11_상속2;
//super은 생성자
//setter언제 쓰냐 객체생성이 되어있을 때

public class ElectronicsCompany extends Company{

	public ElectronicsCompany() {
		super();
	}
	
	public ElectronicsCompany(String companyName) {
		super(companyName + "전자");
		//super.setCompanyName(companyName);
	}
	public void addFactory() {
		System.out.println(super.getCompanyName() + "공장을 추가합니다.");
	}
}
