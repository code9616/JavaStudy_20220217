package a07_반복;

public class ContinueEx {

	public static void main(String[] args) {
		/*
		 * continue -> 계속하다(반복)
		 * 소스코드가 continue를 만나는순간 증감으로 감
		 */

		for(int i = 0; i < 5; i++) {
			if(i != 0 && i % 2 == 0) {
				continue;
			}
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
	}

}
