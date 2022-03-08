package a11_상속2;

public class CompanyTest {
//업캐스팅, 다운캐스팅
	public static void main(String[] args) {
		ElectronicsCompany samsung = new ElectronicsCompany("삼성");
		ElectronicsCompany lg = new ElectronicsCompany("LG");
		DeliveryCompany baemin = new DeliveryCompany("배달의민족");
		DeliveryCompany yogiyo = new DeliveryCompany("요기요");
		
		samsung.setCompanyName("삼숭");

		Company samsung_company = samsung;
		Company lg_company = lg;
		Company baemin_company = baemin;
		Company yogiyo_company = yogiyo;
		
		samsung_company.setCompanyName("삼성");
		
//		samsung.setCompanyName("삼성전자");
//		lg.setCompanyName("LG");
//		baemin.setCompanyName("배달의민족");
//		yogiyo.setCompanyName("요기요");
		
		samsung.showCompanyInfo();
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();
		
		samsung.addFactory();
		lg.addFactory();
		baemin.addMotorcycle();
		yogiyo.addMotorcycle();
		
		samsung_company.showCompanyInfo();
		
//		DeliveryCompany down_samsung_company = (DeliveryCompany)samsung_company;
//		down_samsung_company.addMotorcycle();
		
		ElectronicsCompany down_samsung_company = (ElectronicsCompany)samsung_company;
		down_samsung_company.addFactory();
		
		Company C = new Company();
//		ElectronicsCompany ec = (ElectronicsCompany)c;
//		ec.addFactory();
//		DeliveryCompany ed = (DeliveryCompany)c;
//		ed.addMotorcycle();
		
	}

}
