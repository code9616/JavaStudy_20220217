package a07_반복;

public class GugudnaWhile {

	public static void main(String[] args) {
		int dan = 2;
		int num = 0;
		int result = 0;
		
		while(num < 9) {
			
			
			System.out.println(dan + "X" + (num + 1) + "=" + (dan * (num + 1)));
			num++;
			
		}
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * ...
		 * 2 X 9 = 18
		 */

	}

}
