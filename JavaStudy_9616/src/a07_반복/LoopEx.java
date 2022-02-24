package a07_반복;

public class LoopEx {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			result += (++num);

		}
		
		System.out.println(result);
		
		int i = 0;						//while 증가 된 값을 중간에 사용해야 할때 내가 원하느 조건을 원하는 타이밍에 줄 수 있다.
		
		while(i < 100) {
			i++;
			System.out.println(i);
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------------");
		
		for(int j = 0; j < 100; j++) {    //1의 증가 또는 정해진 규칙대로 실행되어야 할때 for문의 변수는 지역변수대로 바깥에서 쓸수 없다
			System.out.println(j);
		}
		
		int k = 0;
		for(; k < 100;) {
			System.out.println(k);
			k++;
		}
		
	}

}
