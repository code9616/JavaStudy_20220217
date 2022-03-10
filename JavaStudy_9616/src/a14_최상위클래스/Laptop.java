package a14_최상위클래스;

public class Laptop extends Computer{
	private String company;
	private String model;
	
	public Laptop(String company, String model) {
		super();
		this.company = company;
		this.model = model;
	}
	//alt + shift + s 에서 tostring으로 선택해서 하기
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + "]";
	}

	
	
	
}
